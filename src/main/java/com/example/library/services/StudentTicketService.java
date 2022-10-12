package com.example.library.services;

import com.example.library.microservice.json.Response;
import com.example.library.models.StudentTicket;
import com.example.library.models.dto.StudentTicketDto;
import org.springframework.web.multipart.MultipartFile;

public interface StudentTicketService {
    StudentTicketDto add(StudentTicketDto studentTicketDto);

    StudentTicket findById(Long id);

    Response addPhoto(MultipartFile file);

    StudentTicketDto addPhoto1 (StudentTicket studentTicket, MultipartFile file);

    StudentTicketDto delete(Long id);
}
