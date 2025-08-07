package com.livrecatalogue.repository;

import com.livrecatalogue.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {


    @Query("SELECT a FROM Author a WHERE a.name LIKE 'A%'")
    List<Author> findAuthorsStartingWithA();
}

