package com.example.library.mappers;

import com.example.library.mappers.base.CrudMapper;
import com.example.library.models.Author;
import com.example.library.models.dto.AuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AuthorMapper extends CrudMapper<Author, AuthorDto> {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

}
