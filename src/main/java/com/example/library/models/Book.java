package com.example.library.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "books")
public class Book {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    @Column(name = "release_date")
    Date releaseDate;
    int amount;


}
