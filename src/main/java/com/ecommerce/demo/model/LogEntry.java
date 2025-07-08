package com.ecommerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private String level;
    private String message;
    private LocalDateTime timestamp;

    public LogEntry() {
        // Default constructor
    }

    public LogEntry(String serviceName, String level, String message, LocalDateTime timestamp) {
        this.serviceName = serviceName;
        this.level = level;
        this.message = message;
        this.timestamp = timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

