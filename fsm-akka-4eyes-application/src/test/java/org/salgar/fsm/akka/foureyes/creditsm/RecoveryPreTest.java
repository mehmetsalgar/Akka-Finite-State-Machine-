package org.salgar.fsm.akka.foureyes.creditsm;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.salgar.akka.fsm.foureyes.addresscheck.AddressCheckService;
import org.salgar.akka.fsm.foureyes.creditscore.CreditScoreService;
import org.salgar.akka.fsm.foureyes.faudprevention.FraudPreventionService;
import org.salgar.akka.fsm.foureyes.notifier.NotifierService;
import org.salgar.fsm.akka.foureyes.addresscheck.facade.AdressCheckSMFacade;
import org.salgar.fsm.akka.foureyes.credit.CreditSM;
import org.salgar.fsm.akka.foureyes.credit.facade.CreditSMFacade;
import org.salgar.fsm.akka.foureyes.credit.model.*;
import org.salgar.fsm.akka.foureyes.creditscore.facade.CreditScoreSMFacade;
import org.salgar.fsm.akka.foureyes.fraudprevention.facade.FraudPreventionSMFacade;
import org.salgar.fsm.akka.foureyes.usecasekey.CreditUseCaseKeyStrategy;
import org.salgar.fsm.akka.foureyes.variables.PayloadVariableConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.salgar.akka.fsm.foureyes.notifier.NotificationHelper.*;

/**
 * These tests are disabled because they are here to demonstrate the Recovery Capabilities of Akka Framework, so
 * they are designed to run only once per day, if the continuous integration system would try to run multiple times
 * per day, they will fail.
 */
@Disabled
@EnableElasticsearchRepositories("org.salgar.fsm.akka.foureyes.elasticsearch")
@ActiveProfiles({"itest"})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka(
        partitions = 1,
        topics = {"creditSM", "creditScoreSM", "addressCheckSM", "fraudPreventionSM", "multiTenantScreditScoreSM"},
        brokerProperties = {"listeners=PLAINTEXT://localhost:9092", "port=9092"})
@Slf4j
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RecoveryPreTest {
    final List<String> relationShipNotificationList = Arrays.asList("relationshipmanager1@example.com", "relationshipmanager2@example.com");
    final List<String> salesManagerNotificationList = Arrays.asList("salesmanager1@example.com", "salesmanager2@example.com");
    final List<String> creditAnalystNotificationList = List.of("creditanalyst@example.com");
    final List<String> seniorSalesManagerNotificationList = List.of("seniorSalesManagert@example.com");
    final List<String> someOtherManagerNotificationList = List.of("someOtherManager@example.com");
    private final static long WAIT_TIME_BETWEEN_STEPS = TimeUnit.MILLISECONDS.toMillis(700);

    @Autowired
    private CreditSMFacade creditSMFacade;

    @MockBean
    private CreditScoreService creditScoreServiceMockBean;

    @MockBean
    private FraudPreventionService fraudPreventionServiceMockBean;

    @MockBean
    private AddressCheckService addressCheckServiceMockBean;

    @MockBean
    private NotifierService notifierService;

    @Autowired
    private CreditScoreSMFacade creditScoreSMFacade;

    @Autowired
    private FraudPreventionSMFacade fraudPreventionSMFacade;

    @Autowired
    private AdressCheckSMFacade adressCheckSMFacade;

    @BeforeEach
    private void before() {
        prepareNotificationService();
    }

    @SneakyThrows
    @Test
    public void prepareForRecoveryTest() {
        final String creditUuid = "0e679b7f-806f-41db-bd8e-21f3f62aa3e3_"
                + DateTimeFormatter.ofPattern("dd_MM_yyyy").format(LocalDate.now());
        final CustomerV2 customer1 = prepareCustomer1V2();
        final CustomerV2 customer2 = prepareCustomer2V2();

        List<CustomerV2> creditTenants = new ArrayList<>();
        creditTenants.add(customer1);
        creditTenants.add(customer2);

        Map<String, Object> payload = preparePayload(creditUuid, 100000.0, creditTenants);

        /* Mock Preparation */
        doAnswer(invocation -> {
            log.info("Sending Fraud Prevention Result");

            Thread.sleep(1000L);

            Map<String, Object> fraudPreventionResultPayload = new HashMap<>();
            fraudPreventionResultPayload.put(PayloadVariableConstants.FRAUD_PREVENTION_RESULT, true);
            fraudPreventionSMFacade.result(
                    () -> creditUuid,
                    fraudPreventionResultPayload);

            return null;
        }).when(fraudPreventionServiceMockBean).reportFraudPrevention(
                any(),
                any(),
                any());

        doAnswer(invocation -> {
            log.info("Sending Address Check Result");

            Thread.sleep(2000L);

            Map<String, Object> addressCheckResultPayload = new HashMap<>();
            addressCheckResultPayload.put(PayloadVariableConstants.ADDRESS_CHECK_RESULT, true);
            adressCheckSMFacade.result(
                    () -> creditUuid,
                    addressCheckResultPayload);

            return null;
        }).when(addressCheckServiceMockBean).addressExist(
                any(),
                any(),
                any(),
                any());


        /* Test Start */
        creditSMFacade.submit(payload);

        Thread.sleep(WAIT_TIME_BETWEEN_STEPS);

        Future<CreditSM.Response> futureCreditSMState = creditSMFacade.currentState(payload);
        CreditSM.ReportResponse report =
                (CreditSM.ReportResponse) Await.result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(report.state(), instanceOf(CreditSM.CREDIT_APPLICATION_SUBMITTED_$_WAITING_APPROVAL_$_WAITING_MANAGER_APPROVAL.class));
        assertEquals(((List<Customer>)report.state().controlObject().get(PayloadVariableConstants.CREDIT_TENANTS)).get(0), customer1);
        assertEquals(((List<Customer>)report.state().controlObject().get(PayloadVariableConstants.CREDIT_TENANTS)).get(1), customer2);
        verify(notifierService, atLeastOnce()).notify(eq(relationShipNotificationList), anyString());

        payload = preparePayload(creditUuid, creditTenants);
        creditSMFacade.relationshipManagerApproved(payload);

        Thread.sleep(WAIT_TIME_BETWEEN_STEPS);

        futureCreditSMState = creditSMFacade.currentState(payload);

        report =
                (CreditSM.ReportResponse) Await.result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(report.state(), instanceOf(CreditSM.CREDIT_APPLICATION_SUBMITTED_$_RELATIONSHIP_MANAGER_APPROVED.class));
        verify(notifierService, atLeastOnce()).notify(eq(someOtherManagerNotificationList), anyString());

        payload = preparePayload(creditUuid, creditTenants);
        creditSMFacade.someAdditionalManagerApproved(payload);

        Thread.sleep(WAIT_TIME_BETWEEN_STEPS);

        futureCreditSMState = creditSMFacade.currentState(payload);

        report =
                (CreditSM.ReportResponse) Await.result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(report.state(), instanceOf(CreditSM.CREDIT_APPLICATION_SUBMITTED_$_SOME_ADDITIONAL_MANAGER_APPROVED_$_WAITING_MANAGER_APPROVAL.class));
        verify(notifierService, atLeastOnce()).notify(eq(salesManagerNotificationList), anyString());

        payload = preparePayload(creditUuid, creditTenants);
        creditSMFacade.salesManagerApproved(payload);

        Thread.sleep(20000);
        verify(notifierService, atLeastOnce()).notify(eq(salesManagerNotificationList), anyString());

        futureCreditSMState = creditSMFacade.currentState(payload);

        report =
                (CreditSM.ReportResponse) Await.result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(
                report.state(),
                instanceOf(CreditSM.
                        CREDIT_APPLICATION_SUBMITTED_$_SALES_MANAGER_APPROVED_$_FRAUDPREVENTION_ADRESSCHECK_RESULT_RECEIVED
                        .class));

        verify(creditScoreServiceMockBean,
                times(2)).calculateCreditScore(anyString(), anyString(), anyString());
        verify(fraudPreventionServiceMockBean).reportFraudPrevention(anyString(), anyString(), anyString());
        verify(addressCheckServiceMockBean).addressExist(anyString(), anyString(), anyString(), anyString());

        Thread.sleep(TimeUnit.SECONDS.toMillis(30));
    }

    @SneakyThrows
    @Test
    public void prepareForRecoveryOnlyOneCreditScoreEventReceivedTest() {
        final String creditUuid = "0e679b7f-806f-41db-bd8e-21f3f62aa3e4_"
                + DateTimeFormatter.ofPattern("dd_MM_yyyy").format(LocalDate.now());
        final CustomerV2 customer1 = prepareCustomer1V2();
        final CustomerV2 customer2 = prepareCustomer2V2();

        List<CustomerV2> creditTenants = new ArrayList<>();
        creditTenants.add(customer1);
        creditTenants.add(customer2);

        Map<String, Object> payload = preparePayload(creditUuid, 100000.0, creditTenants);

        /* Mock Preparation */
        doAnswer(invocation -> {
            if(invocation.getArgument(2).equals(customer2.getCustomerId())) {
                log.info("Sending Credit Score Result customer2");

                Thread.sleep(5000L);

                Map<String, Object> creditScorePayload = new HashMap<>();
                creditScorePayload.put(PayloadVariableConstants.CREDIT_SCORE_RESULT, 97.45);
                creditScoreSMFacade.resultReceived(
                        () -> creditUuid + "_" + customer2.getCustomerId(),
                        creditScorePayload);
            } else {
                String personalId = invocation.getArgument(2);
                log.warn("Unkown customer: {}", personalId);
            }

            return null;
        }).when(creditScoreServiceMockBean).calculateCreditScore(any(), any(), any());

        doAnswer(invocation -> {
            log.info("Sending Fraud Prevention Result");

            Thread.sleep(1000L);

            Map<String, Object> fraudPreventionResultPayload = new HashMap<>();
            fraudPreventionResultPayload.put(PayloadVariableConstants.FRAUD_PREVENTION_RESULT, true);
            fraudPreventionSMFacade.result(
                    () -> creditUuid,
                    fraudPreventionResultPayload);

            return null;
        }).when(fraudPreventionServiceMockBean).reportFraudPrevention(
                any(), any(), any());

        doAnswer(invocation -> {
            log.info("Sending Address Check Result");

            Thread.sleep(2000L);

            Map<String, Object> addressCheckResultPayload = new HashMap<>();
            addressCheckResultPayload.put(PayloadVariableConstants.ADDRESS_CHECK_RESULT, true);
            adressCheckSMFacade.result(
                    () -> creditUuid,
                    addressCheckResultPayload);

            return null;
        }).when(addressCheckServiceMockBean).addressExist(
                any(),
                any(),
                any(),
                any());


        /* Test Start */

        creditSMFacade.submit(payload);

        Thread.sleep(WAIT_TIME_BETWEEN_STEPS);

        Future<CreditSM.Response> futureCreditSMState = creditSMFacade.currentState(payload);
        CreditSM.ReportResponse report =
                (CreditSM.ReportResponse) Await.result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(report.state(), instanceOf(CreditSM.CREDIT_APPLICATION_SUBMITTED_$_WAITING_APPROVAL_$_WAITING_MANAGER_APPROVAL.class));
        assertEquals(((List<CustomerV2>)report.state().controlObject().get(PayloadVariableConstants.CREDIT_TENANTS)).get(0), customer1);
        assertEquals(((List<CustomerV2>)report.state().controlObject().get(PayloadVariableConstants.CREDIT_TENANTS)).get(1), customer2);
        verify(notifierService, atLeastOnce()).notify(eq(relationShipNotificationList), anyString());

        payload = preparePayload(creditUuid, creditTenants);
        creditSMFacade.relationshipManagerApproved(payload);

        Thread.sleep(WAIT_TIME_BETWEEN_STEPS);

        futureCreditSMState = creditSMFacade.currentState(payload);

        report =
                (CreditSM.ReportResponse) Await.result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(report.state(), instanceOf(CreditSM.CREDIT_APPLICATION_SUBMITTED_$_RELATIONSHIP_MANAGER_APPROVED.class));
        verify(notifierService, atLeastOnce()).notify(eq(someOtherManagerNotificationList), anyString());

        payload = preparePayload(creditUuid, creditTenants);
        creditSMFacade.someAdditionalManagerApproved(payload);

        Thread.sleep(WAIT_TIME_BETWEEN_STEPS);

        futureCreditSMState = creditSMFacade.currentState(payload);

        report =
                (CreditSM.ReportResponse) Await.result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(report.state(), instanceOf(CreditSM.CREDIT_APPLICATION_SUBMITTED_$_SOME_ADDITIONAL_MANAGER_APPROVED_$_WAITING_MANAGER_APPROVAL.class));
        verify(notifierService, atLeastOnce()).notify(eq(salesManagerNotificationList), anyString());

        payload = preparePayload(creditUuid, creditTenants);
        creditSMFacade.salesManagerApproved(payload);

        Thread.sleep(20000);

        futureCreditSMState = creditSMFacade.currentState(payload);

        report =
                (CreditSM.ReportResponse) Await
                        .result(futureCreditSMState, Duration.create(20, TimeUnit.SECONDS));

        assertNotNull(report);
        assertThat(
            report.state(),
            instanceOf(
                CreditSM.CREDIT_APPLICATION_SUBMITTED_$_SALES_MANAGER_APPROVED_$_FRAUDPREVENTION_ADRESSCHECK_RESULT_RECEIVED.class));

        verify(creditScoreServiceMockBean, times(2))
                .calculateCreditScore(anyString(), anyString(), anyString());
        verify(fraudPreventionServiceMockBean).reportFraudPrevention(anyString(), anyString(), anyString());
        verify(addressCheckServiceMockBean).addressExist(anyString(), anyString(), anyString(), anyString());

        Thread.sleep(TimeUnit.SECONDS.toMillis(30));
    }
    private CustomerV2 prepareCustomer1V2() {
        IdentificationInformation identificationInformation =
                new IdentificationInformation(
                        "123456789X",
                        "PASS"
                );
        IncomeProof incomeProof =
                new IncomeProof(
                        UUID.randomUUID().toString(),
                        "ABC",
                        "99999.99"
                );
        FixExpanse expanseRent =
                new FixExpanse(
                        UUID.randomUUID().toString(),
                        "1500",
                        "Rent"
                );
        FixExpanse expanseCarCredit =
                new FixExpanse(
                        UUID.randomUUID().toString(),
                        "600",
                        "Credit"
                );

        return new CustomerV2(
                "123456789X",
                "John",
                "Doe",
                "customer1@test.org",
                List.of(new Address(
                        "muster strasse 1",
                        "11A",
                        "city1",
                        "country1"
                )),
                List.of(identificationInformation),
                List.of(incomeProof),
                Arrays.asList(expanseRent, expanseCarCredit)
        );
    }

    private CustomerV2 prepareCustomer2V2() {
        IdentificationInformation identificationInformation =
                new IdentificationInformation(
                        "Z987654321",
                        "PERSO"
                );
        IncomeProof incomeProof =
                new IncomeProof(
                        UUID.randomUUID().toString(),
                        "ZXY",
                        "1111.11"
                );
        FixExpanse expanseCarCredit =
                new FixExpanse(
                        UUID.randomUUID().toString(),
                        "900",
                        "Credit"
                );


        return new CustomerV2(
                "Z987654321",
                "Max",
                "Musterman",
                "customer1@test.org",
                List.of(new Address(
                        "muster strasse 1",
                        "11A",
                        "city1",
                        "country1"
                )),
                List.of(identificationInformation),
                List.of(incomeProof),
                List.of(expanseCarCredit)
        );
    }

    private Map<String, Object> preparePayload(
            String creditUuid,
            Double creditAmount,
            List<CustomerV2> creditTenants) {

        final Map<String, Object> payload = new HashMap<>();
        CreditApplication creditApplication = new CreditApplication(
                creditAmount,
                new CreditTenants(creditTenants)
        );
        payload.put(CreditUseCaseKeyStrategy.CREDIT_UUID, creditUuid);
        payload.put(PayloadVariableConstants.CREDIT_APPLICATION, creditApplication);

        return payload;
    }

    private Map<String, Object> preparePayload(
            String creditUuid,
            List<CustomerV2> creditTenants) {

        final Map<String, Object> payload = new HashMap<>();
        payload.put(CreditUseCaseKeyStrategy.CREDIT_UUID, creditUuid);
        payload.put(PayloadVariableConstants.CREDIT_TENANTS, creditTenants);

        return payload;
    }

    private void prepareNotificationService() {
        doAnswer(
                invocation -> {
                    if(RELATIONSHIP_MANAGER_NOTIFICATION_LIST.equals(invocation.getArgument(0))) {
                        return relationShipNotificationList;
                    } else if(SALES_MANAGER_NOTIFICATION_LIST.equals(invocation.getArgument(0))) {
                        return salesManagerNotificationList;
                    } else if(CREDIT_ANALYST_NOTIFICATION_LIST.equals(invocation.getArgument(0))) {
                        return creditAnalystNotificationList;
                    } else if(SENIOR_SALES_MANAGER_NOTIFICATION_LIST.equals(invocation.getArgument(0))) {
                        return seniorSalesManagerNotificationList;
                    } else if(SOME_OTHER_MANAGER_NOTIFICATION_LIST.equals(invocation.getArgument(0))) {
                        return someOtherManagerNotificationList;
                    }
                    return null;
                }
        ).when(notifierService).calculateRecipientList(anyString());
    }
}