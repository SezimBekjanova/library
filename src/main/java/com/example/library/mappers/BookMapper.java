package com.example.library.mappers;

import com.example.library.mappers.base.CrudMapper;
import com.example.library.models.Book;
import com.example.library.models.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BookMapper extends CrudMapper<Book, BookDto> {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
}
