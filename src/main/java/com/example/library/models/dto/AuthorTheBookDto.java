package com.example.library.models.dto;

import com.example.library.models.Author;
import com.example.library.models.Book;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthorTheBookDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Author author;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Book book;
}
