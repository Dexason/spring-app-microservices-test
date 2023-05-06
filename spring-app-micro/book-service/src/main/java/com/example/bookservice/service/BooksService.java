package com.example.bookservice.service;

import com.example.bookservice.dao.BooksRepository;
import com.example.bookservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BooksService {
    private final BooksRepository booksRepository;

    public List<Book> findAllBooks() {
        return booksRepository.findAll();
    }
    public void save(Book book) {
        booksRepository.save(book);
    }
}
