package com.gabrielfernandes.estudo.spring.kafka.springkafkaconsumer.consumer;

import com.gabrielfernandes.estudo.spring.kafka.springkafkaconsumer.enums.TopicConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = TopicConstants.TOPIC, groupId = TopicConstants.GROUP_ID)
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group " + TopicConstants.GROUP_ID + ": " + message);
    }
}
