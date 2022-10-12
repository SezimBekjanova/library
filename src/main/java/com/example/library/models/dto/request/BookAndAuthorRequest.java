package com.example.library.models.dto.request;

import com.example.library.models.dto.AuthorDto;
import com.example.library.models.dto.BookDto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookAndAuthorRequest {
    BookDto bookDto;
    AuthorDto authorDto;
}
