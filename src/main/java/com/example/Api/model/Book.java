package com.example.Api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private final String name;
    private final Author author;
    private final int availableCopies;

    public Book(String name, Author author, int availableCopies) {
        this.name = name;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
