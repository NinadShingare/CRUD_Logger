package com.ecommerce.demo.controller;

import com.ecommerce.demo.model.LogEntry;
import com.ecommerce.demo.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    @Autowired
    private LogRepository repository;

    @PostMapping
    public ResponseEntity<String> saveLog(@RequestBody LogEntry log){
        log.setTimestamp(LocalDateTime.now());
        repository.save(log);
        return ResponseEntity.ok("Log saved");
    }


}
