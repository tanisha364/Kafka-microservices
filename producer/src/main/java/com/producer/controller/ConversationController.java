package com.producer.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.producer.service.KafkaService;

@RestController
@RequestMapping("/message")
public class ConversationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
    	kafkaService.sendMessage(message);
        return ResponseEntity.ok("Message published to Kafka topic");
    }
    
}
