package com.example.clientservice.controller;

import com.example.clientservice.model.Book;
import com.example.clientservice.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/client")
public class BookRestController {
    private final BookService bookService;
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooksByFeign();
    }
}
