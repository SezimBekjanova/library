package com.example.library.services.impl;

import com.example.library.mappers.AuthorTheBookMapper;
import com.example.library.mappers.BookAndAuthorMapper;
import com.example.library.models.Author;
import com.example.library.models.AuthorTheBook;
import com.example.library.models.Book;
import com.example.library.models.dto.request.BookAndAuthorRequest;
import com.example.library.repo.AuthorTheBookRepo;
import com.example.library.services.AuthorTheBookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorTheBookServiceImpl implements AuthorTheBookService {
    private final AuthorTheBookRepo authorTheBookRepo;
    private final AuthorTheBookMapper authorTheBookMapper;
    private final BookAndAuthorMapper bookAndAuthorMapper;


    public AuthorTheBookServiceImpl(AuthorTheBookRepo authorTheBookRepo) {
        this.authorTheBookRepo = authorTheBookRepo;
        this.bookAndAuthorMapper = BookAndAuthorMapper.INSTANCE;
        this.authorTheBookMapper = AuthorTheBookMapper.INSTANCE;
    }
    @Override
    public AuthorTheBook save(Author author, Book book) {
        AuthorTheBook authorTheBook = new AuthorTheBook();
        System.out.println(authorTheBook);
        authorTheBook.setAuthor(author);
        authorTheBook.setBook(book);
        System.out.println(authorTheBook + "11111111");
        authorTheBookRepo.save(authorTheBook);
        return authorTheBook;
    }

    @Override
    public AuthorTheBook findByBookId(Long id) {
        return authorTheBookRepo.findByBookId(id);
    }

    @Override
    public List<AuthorTheBook> findAll() {
        return authorTheBookRepo.findAll();
    }
}
