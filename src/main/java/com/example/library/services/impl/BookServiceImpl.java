package com.example.library.services.impl;

import com.example.library.mappers.BookMapper;
import com.example.library.models.Author;
import com.example.library.models.AuthorTheBook;
import com.example.library.models.Book;
import com.example.library.models.dto.request.BookAndAuthorRequest;
import com.example.library.repo.BookRepo;
import com.example.library.services.AuthorService;
import com.example.library.services.AuthorTheBookService;
import com.example.library.services.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepo bookRepo;
    private final BookMapper bookMapper;
    private final AuthorService authorService;
    private final AuthorTheBookService authorTheBookService;

    public BookServiceImpl(BookRepo bookRepo, AuthorService authorService, AuthorTheBookService authorTheBookService) {
        this.bookRepo = bookRepo;
        this.authorService = authorService;
        this.authorTheBookService = authorTheBookService;
        this.bookMapper = BookMapper.INSTANCE;
    }

    @Override
    public BookAndAuthorRequest add(BookAndAuthorRequest bookAndAuthorRequest) {
        Book book = bookMapper.toEntity(bookAndAuthorRequest.getBookDto());
        authorService.save(bookAndAuthorRequest.getAuthorDto());
        save(bookAndAuthorRequest);
        Author author = authorService.findByName(bookAndAuthorRequest.getAuthorDto().getName());
        authorTheBookService.save(author, book);
        return bookAndAuthorRequest;
    }

    @Override
    public Book save(Book book,Author author) {
        return null;
    }

    @Override
    public Book save(BookAndAuthorRequest bookAndAuthorRequest) {
        List<Book> bookList = findByTitle(bookAndAuthorRequest.getBookDto().getTitle());
        System.out.println(bookList);
        if(bookList.equals(null)){
            bookRepo.save(bookMapper.toEntity(bookAndAuthorRequest.getBookDto()));
        }else {
            List<AuthorTheBook> authorTheBookList = authorTheBookService.findAll();
            List<AuthorTheBook> authorTheBookListNew = authorTheBookList
                    .stream()
                    .filter(x -> x.getBook().getTitle().equals(bookAndAuthorRequest.getBookDto().getTitle()))
                    .collect(Collectors.toList());
            List<AuthorTheBook> authorTheBookListNew2 = authorTheBookListNew
                    .stream()
                    .filter(x -> x.getAuthor().getName().equals(bookAndAuthorRequest.getAuthorDto().getName()))
                    .collect(Collectors.toList());
        }
        return null;
    }
/*
        List<ServerStatistics> serverStatisticsList1 =  serverStatisticsList
                .stream()
                .filter(x-> x.getStatus()!=null && x.getDate()!=null)
                .collect(Collectors.toList());
 */
        /*findByTitle(book.getTitle());
            AuthorTheBook authorTheBook = authorTheBookService.findByBookId(book.getId());
            if(!authorService.findById(authorTheBook.getAuthor().getId()).equals(author))
                bookRepo.save(book);
            else
                bookRepo.update(book.getId());
        return null;
    }

     */

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookList = new ArrayList<>();
        return bookList;
    }
}
