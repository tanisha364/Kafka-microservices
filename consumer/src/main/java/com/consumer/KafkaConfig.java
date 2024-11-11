package com.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {


    @KafkaListener(topics = AppConstants.CONVERSATION_TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String value) {
        System.out.println(value);

    }

}