package com.example.bookservice.controller;

import com.example.bookservice.model.Book;
import com.example.bookservice.service.BooksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping()
public class BooksController {
    private BooksService booksService;

    @GetMapping("/api/books")
    public List<Book> getAllBooksList() {
        return booksService.findAllBooks();
    }
}
