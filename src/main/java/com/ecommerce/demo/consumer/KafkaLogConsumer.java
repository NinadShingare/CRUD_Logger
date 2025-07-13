package com.ecommerce.demo.consumer;

import com.ecommerce.demo.model.LogEntry;
import com.ecommerce.demo.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaLogConsumer {

    @Autowired
    private LogRepository repository;

    @KafkaListener(topics = "logs", groupId = "log-group", containerFactory = "kafkaListenerContainerFactory")
    public void consume(LogEntry log) {
        System.out.println("Receiving log from Kafka: " + log);
        repository.save(log);
        System.out.println("Saved log: " + log.getMessage());
    }
}

