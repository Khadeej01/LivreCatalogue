package com.livrecatalogue.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {

    @Id
    private Long id ;
    private String name ;
    private String biography ;


    public Author( Long id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;


    }

    public Author() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
