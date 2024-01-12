package org.salgar.fsm.pekko.foureyes.creditscore.kafka.config

import org.salgar.fsm.pekko.foureyes.credit.kafka.config.TopicConfig
import org.salgar.fsm.pekko.foureyes.creditscore.protobuf.MultiTenantCreditScoreSMCommand
import org.salgar.fsm.pekko.kafka.config.ConsumerConfig
import org.salgar.fsm.pekko.pekkosystem.ActorService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.stereotype.Component

import java.util.stream.Collectors

@Component
class MultiTenantCreditScoreSMConsumerConfig(
    actorService: ActorService,
    topicConfig: TopicConfig,
    kafkaProperties: KafkaProperties,
    @Qualifier("multiTenantCreditScoreSMProperties") consumerProperties: KafkaProperties.Consumer
) extends ConsumerConfig[String, MultiTenantCreditScoreSMCommand] {
  override val consumerSettings: ConsumerSettings[String, MultiTenantCreditScoreSMCommand] =
    ConsumerSettings(
      actorService.actorSystem(),
      topicConfig.topicMultiTenantCreditScoreSM.key.deserializer(),
      topicConfig.topicMultiTenantCreditScoreSM.value.deserializer()
    ).withBootstrapServers(
        kafkaProperties.getBootstrapServers
          .stream()
          .map(server => server)
          .collect(Collectors.joining(","))
      )
      .withClientId("pekko-consumer-multi-tenant-credit-score-s-m")
      .withGroupId(consumerProperties.getGroupId)
      .withProperties(consumerProperties.buildProperties().asInstanceOf[java.util.Map[String, String]])
      .withStopTimeout(0.seconds)
}
