package com.example.clientservice.service;

import com.example.clientservice.connector.BookServiceConnector;
import com.example.clientservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    @Value("${book-service.url}")
    static private String bookServiceUrl;
    private BookServiceConnector bookServiceConnector;

    public List<Book> getAllBooksByFeign() {
        return bookServiceConnector.getAllBooksList();
    }
}
