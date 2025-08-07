package com.livrecatalogue.repository;


import com.livrecatalogue.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {



}
