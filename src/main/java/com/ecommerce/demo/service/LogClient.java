package com.ecommerce.demo.service;


import com.ecommerce.demo.model.LogEntry;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LogClient {

    private final RestTemplate restTemplate;

    public LogClient(RestTemplateBuilder builder){
        this.restTemplate = builder.build();
    }

    public void sendLog(String service, String level, String message){
        LogEntry log = new LogEntry(service, level, message, null);
        restTemplate.postForObject("http://localhost:8082/api/logs",log, String.class);
    }


}
