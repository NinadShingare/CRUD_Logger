package com.ecommerce.demo.repository;


import com.ecommerce.demo.model.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<LogEntry, Long> {

}
