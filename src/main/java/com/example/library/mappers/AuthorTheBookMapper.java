package com.example.library.mappers;

import com.example.library.mappers.base.CrudMapper;
import com.example.library.models.AuthorTheBook;
import com.example.library.models.dto.AuthorTheBookDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AuthorTheBookMapper extends CrudMapper<AuthorTheBook, AuthorTheBookDto> {
    AuthorTheBookMapper INSTANCE = Mappers.getMapper(AuthorTheBookMapper.class);
}
