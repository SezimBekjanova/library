package com.example.library.services;

import com.example.library.models.Author;
import com.example.library.models.AuthorTheBook;
import com.example.library.models.Book;
import com.example.library.models.dto.request.BookAndAuthorRequest;

import java.util.List;

public interface AuthorTheBookService {
    AuthorTheBook save(Author author, Book book);
    AuthorTheBook findByBookId(Long id);
    List<AuthorTheBook> findAll();
}
