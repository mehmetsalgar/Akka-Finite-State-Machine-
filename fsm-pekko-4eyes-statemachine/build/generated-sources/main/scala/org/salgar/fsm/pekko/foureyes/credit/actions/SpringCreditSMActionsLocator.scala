package org.salgar.fsm.pekko.foureyes.credit.actions

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import javax.annotation.PostConstruct

object SpringCreditSMActionsLocator {
  private var springCreditSMActionsLocator: SpringCreditSMActionsLocator = _

  def getInstance(): SpringCreditSMActionsLocator = {
    springCreditSMActionsLocator
  }
}

@Component
case class SpringCreditSMActionsLocator(
    @Autowired creditsm_ADRRESCHECK_RESULT_RECEIVED_$$_FRAUDPREVENTION_ADRESSCHECK_RESULT_RECEIVED_addressCheckResultReceived_fraudPreventionResultReceivedAction: ADRRESCHECK_RESULT_RECEIVED_$$_FRAUDPREVENTION_ADRESSCHECK_RESULT_RECEIVED_addressCheckResultReceived_fraudPreventionResultReceived_Action,
    @Autowired creditsm_ADRRESCHECK_RESULT_RECEIVED_$$_CREDITSCORE_ADDRESSCHECK_RESULT_RECEIVED_addressCheck_CredfitScore_onResultReceivedAction: ADRRESCHECK_RESULT_RECEIVED_$$_CREDITSCORE_ADDRESSCHECK_RESULT_RECEIVED_addressCheck_CredfitScore_onResultReceived_Action,
    @Autowired creditsm_WAITING_CREDIT_ANALYST_APPROVAL_$$_CREDIT_ACCEPTED_creditAnalyst_onAcceptedAction: WAITING_CREDIT_ANALYST_APPROVAL_$$_CREDIT_ACCEPTED_creditAnalyst_onAccepted_Action,
    @Autowired creditsm_CREDITSCORE_RECEIVED_$$_CREDITSCORE_FRAUDPREVENTION_RESULT_RECEIVED_creditScoreReceived_creditScore_fraudPreventionResultAction: CREDITSCORE_RECEIVED_$$_CREDITSCORE_FRAUDPREVENTION_RESULT_RECEIVED_creditScoreReceived_creditScore_fraudPreventionResult_Action,
    @Autowired creditsm_CREDITSCORE_RECEIVED_$$_CREDITSCORE_ADDRESSCHECK_RESULT_RECEIVED_creditScore_addressCheck_onResultReceivedAction: CREDITSCORE_RECEIVED_$$_CREDITSCORE_ADDRESSCHECK_RESULT_RECEIVED_creditScore_addressCheck_onResultReceived_Action,
    @Autowired creditsm_CREDIT_APPLICATION_SUBMITTED_$$_CREDIT_APPLICATION_SUBMITTED_customer_updatedAction: CREDIT_APPLICATION_SUBMITTED_$$_CREDIT_APPLICATION_SUBMITTED_customer_updated_Action,
    @Autowired creditsm_FRAUDPREVENTION_RESULT_RECEIVED_$$_FRAUDPREVENTION_ADRESSCHECK_RESULT_RECEIVED_fraudPReventionResultReceived_fraudPReventionResultReceivedAction: FRAUDPREVENTION_RESULT_RECEIVED_$$_FRAUDPREVENTION_ADRESSCHECK_RESULT_RECEIVED_fraudPReventionResultReceived_fraudPReventionResultReceived_Action,
    @Autowired creditsm_FRAUDPREVENTION_RESULT_RECEIVED_$$_CREDITSCORE_FRAUDPREVENTION_RESULT_RECEIVED_fraudPreventionResultReceived_creditScoreFraudPreventionResultReceivedAction: FRAUDPREVENTION_RESULT_RECEIVED_$$_CREDITSCORE_FRAUDPREVENTION_RESULT_RECEIVED_fraudPreventionResultReceived_creditScoreFraudPreventionResultReceived_Action,
    @Autowired creditsm_INITIAL_CA_$$_WAITING_APPROVAL_initalAction: INITIAL_CA_$$_WAITING_APPROVAL_inital_Action,
    @Autowired creditsm_INITIAL_FE_$$_WAITING_MANAGER_APPROVAL_initialAction: INITIAL_FE_$$_WAITING_MANAGER_APPROVAL_initial_Action,
    @Autowired creditsm_INITIAL_CA_SM_$$_WAITING_ANAYLIST_APPROVAL_initialAction: INITIAL_CA_SM_$$_WAITING_ANAYLIST_APPROVAL_initial_Action,
    @Autowired creditsm_INITIAL_CSC_$$_ADRRESCHECK_RESULT_RECEIVED_initial_AddressCheckResultReceivedAction: INITIAL_CSC_$$_ADRRESCHECK_RESULT_RECEIVED_initial_AddressCheckResultReceived_Action,
    @Autowired creditsm_INITIAL_CSC_$$_FRAUDPREVENTION_RESULT_RECEIVED_initial_FraudPreventionResultReceivedAction: INITIAL_CSC_$$_FRAUDPREVENTION_RESULT_RECEIVED_initial_FraudPreventionResultReceived_Action,
    @Autowired creditsm_INITIAL_CSC_$$_CREDITSCORE_RECEIVED_initial_creditScoreReceivedAction: INITIAL_CSC_$$_CREDITSCORE_RECEIVED_initial_creditScoreReceived_Action,
    @Autowired creditsm_INITIAL_FE_SM_$$_WAITING_MANAGER_APPROVAL_intialAction: INITIAL_FE_SM_$$_WAITING_MANAGER_APPROVAL_intial_Action,
    @Autowired creditsm_INITIAL_$$_CREDIT_APPLICATION_SUBMITTED_intial_onSubmitAction: INITIAL_$$_CREDIT_APPLICATION_SUBMITTED_intial_onSubmit_Action,
    @Autowired creditsm_CREDIT_APPLICATION_SUBMITTED_$$_CREDIT_REJECTED_lowScore_onResultReceivedAction: CREDIT_APPLICATION_SUBMITTED_$$_CREDIT_REJECTED_lowScore_onResultReceived_Action,
    @Autowired creditsm_CREDIT_APPLICATION_SUBMITTED_$$_CREDIT_REJECTED_managerRejected_onRejectedAction: CREDIT_APPLICATION_SUBMITTED_$$_CREDIT_REJECTED_managerRejected_onRejected_Action,
    @Autowired creditsm_RELATIONSHIP_MANAGER_APPROVED_$$_SALES_MANAGER_APPROVED_relationshipManagerApproved_onSalesManagerApprovedAction: RELATIONSHIP_MANAGER_APPROVED_$$_SALES_MANAGER_APPROVED_relationshipManagerApproved_onSalesManagerApproved_Action,
    @Autowired creditsm_SALES_MANAGER_APPROVED_$$_WAITING_APPROVAL_FROM_SENIOR_MANAGER_salesManagerApproved_onCreditScoreReceivedAction: SALES_MANAGER_APPROVED_$$_WAITING_APPROVAL_FROM_SENIOR_MANAGER_salesManagerApproved_onCreditScoreReceived_Action,
    @Autowired creditsm_SALES_MANAGER_APPROVED_$$_WAITING_CREDIT_ANALYST_APPROVAL_salesManagerApproved_onResultReceivedAction: SALES_MANAGER_APPROVED_$$_WAITING_CREDIT_ANALYST_APPROVAL_salesManagerApproved_onResultReceived_Action,
    @Autowired creditsm_WAITING_ANAYLIST_APPROVAL_$$_WAITING_ANAYLIST_APPROVAL_waitingAnalystApproval_onCreditAcceptedAction: WAITING_ANAYLIST_APPROVAL_$$_WAITING_ANAYLIST_APPROVAL_waitingAnalystApproval_onCreditAccepted_Action,
    @Autowired creditsm_WAITING_APPROVAL_FROM_SENIOR_MANAGER_$$_WAITING_CREDIT_ANALYST_APPROVAL_waitingApprovalFromSeniorOfficier_onAcceptableScoreAction: WAITING_APPROVAL_FROM_SENIOR_MANAGER_$$_WAITING_CREDIT_ANALYST_APPROVAL_waitingApprovalFromSeniorOfficier_onAcceptableScore_Action,
    @Autowired creditsm_WAITING_APPROVAL_$$_RELATIONSHIP_MANAGER_APPROVED_waitingApproval_onRelationshipManagerApprovedAction: WAITING_APPROVAL_$$_RELATIONSHIP_MANAGER_APPROVED_waitingApproval_onRelationshipManagerApproved_Action,
    @Autowired creditsm_WAITING_MANAGER_APPROVAL_$$_WAITING_MANAGER_APPROVAL_waitingForApproval_onSalesManagerApprovedAction: WAITING_MANAGER_APPROVAL_$$_WAITING_MANAGER_APPROVAL_waitingForApproval_onSalesManagerApproved_Action,
    @Autowired creditsm_WAITING_MANAGER_APPROVAL_$$_WAITING_MANAGER_APPROVAL_waitingManagerApproval_onRelationshipManagerApprovedAction: WAITING_MANAGER_APPROVAL_$$_WAITING_MANAGER_APPROVAL_waitingManagerApproval_onRelationshipManagerApproved_Action
 ) {
  import SpringCreditSMActionsLocator._

  @PostConstruct
  def init: Unit = {
    springCreditSMActionsLocator = this
  }
}
