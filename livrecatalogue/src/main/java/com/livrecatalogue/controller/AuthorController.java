package com.livrecatalogue.controller;

import com.livrecatalogue.entity.Author;
import com.livrecatalogue.repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/id")
    public Author getAuthorById(@PathVariable Long id) {
        return authorRepository.findById(id).get();
    }

}

