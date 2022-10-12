package com.example.library.controllers;

import com.example.library.models.dto.BookDto;
import com.example.library.models.dto.request.BookAndAuthorRequest;
import com.example.library.services.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public BookAndAuthorRequest save(@RequestBody BookAndAuthorRequest bookAndAuthorRequest){
        return bookService.add(bookAndAuthorRequest);
    }


}
