package com.example.library.services;

import com.example.library.models.Author;
import com.example.library.models.Book;
import com.example.library.models.dto.request.BookAndAuthorRequest;

import java.util.List;

public interface BookService {
    BookAndAuthorRequest add(BookAndAuthorRequest bookAndAuthorRequest);
    Book save(Book book, Author author);
    Book save(BookAndAuthorRequest bookAndAuthorRequest);
    List<Book> findByTitle(String title);
}
