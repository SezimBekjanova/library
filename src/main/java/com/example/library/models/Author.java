package com.example.library.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "authors")
public class Author {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
}
