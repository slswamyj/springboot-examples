package com.hellokoding.springboot.jpa.book;

import lombok.*;

import javax.persistence.*;

@Data

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private BookDetail bookDetail;
}
