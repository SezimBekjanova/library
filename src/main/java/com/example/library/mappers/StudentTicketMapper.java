package com.example.library.mappers;

import com.example.library.mappers.base.CrudMapper;
import com.example.library.models.StudentTicket;
import com.example.library.models.dto.StudentTicketDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface StudentTicketMapper extends CrudMapper<StudentTicket, StudentTicketDto> {
    StudentTicketMapper INSTANCE = Mappers.getMapper(StudentTicketMapper.class);
}
