package com.example.library.mappers;

import com.example.library.mappers.base.CrudMapper;
import com.example.library.models.AuthorTheBook;
import com.example.library.models.dto.request.BookAndAuthorRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BookAndAuthorMapper extends CrudMapper<AuthorTheBook, BookAndAuthorRequest> {
    BookAndAuthorMapper INSTANCE = Mappers.getMapper(BookAndAuthorMapper.class);
}
