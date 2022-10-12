package com.example.library.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "author_the_book")
public class AuthorTheBook {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "id_author")
    Author author;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_book")
    Book book;
}
