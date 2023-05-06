package com.example.clientservice.connector;

import com.example.clientservice.config.FeignConfig;
import com.example.clientservice.model.Book;
import feign.Feign;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Collections;
import java.util.List;

@Component
@FeignClient(
        name = "book-service",
        url = "${book-service.url}",
        configuration = FeignConfig.class
)
@CircuitBreaker(name = "book-service", fallbackMethod = "fallback")
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooksList();

    default List<Book> fallback(Throwable ex) {
        final Logger log = LogManager.getLogger(Feign.class);
        log.info(ex.getMessage());
        return Collections.emptyList();
    }
}
