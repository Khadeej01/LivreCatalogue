package com.livrecatalogue.controller;

import com.livrecatalogue.entity.Book;
import com.livrecatalogue.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {


        private final BookRepository bookRepository;

        public BookController(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }

        @PostMapping
        public Book addBook(@RequestBody Book book) {
            return bookRepository.save(book);
        }

        @GetMapping
        public List<Book> getAllBooks() {
            return bookRepository.findAll();
        }

        @GetMapping("/{id}")
        public Book getBookById(@PathVariable Long id) {
            return bookRepository.findById(id).orElseThrow();
        }


    }



