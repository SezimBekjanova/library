package com.example.library.services.impl;

import com.example.library.mappers.StudentTicketMapper;
import com.example.library.microservice.FileServiceFeign;
import com.example.library.microservice.json.Response;
import com.example.library.models.StudentTicket;
import com.example.library.models.dto.StudentTicketDto;
import com.example.library.models.enums.StudentTicketActive;
import com.example.library.repo.StudentTicketRepo;
import com.example.library.services.StudentTicketService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StudentTicketServiceImpl implements StudentTicketService {
    private final StudentTicketRepo studentTicketRepo;
    private final StudentTicketMapper studentTicketMapper;
    private final FileServiceFeign fileServiceFeign;

    public StudentTicketServiceImpl(StudentTicketRepo studentTicketRepo, FileServiceFeign fileServiceFeign) {
        this.studentTicketRepo = studentTicketRepo;
        this.studentTicketMapper = StudentTicketMapper.INSTANCE;
        this.fileServiceFeign = fileServiceFeign;
    }

    @Override
    public StudentTicketDto add(StudentTicketDto studentTicketDto) {
        StudentTicket studentTicket = studentTicketMapper.toEntity(studentTicketDto);
        studentTicket.setActive(StudentTicketActive.YES);
        studentTicketRepo.save(studentTicket);
        return studentTicketDto;
    }

    @Override
    public StudentTicket findById(Long id) {
        return studentTicketRepo.findById(id).orElseThrow(()->new RuntimeException("Такого пользователя нет"));
    }

    @Override
    public Response addPhoto(MultipartFile file) {
        Response response = fileServiceFeign.upload(file);
        System.out.println(response);
        return response;
    }

    @Override
    public StudentTicketDto addPhoto1(StudentTicket studentTicket, MultipartFile file) {
        Response response = fileServiceFeign.upload(file);
        studentTicket.setPhoto(response.getDownloadUri());
        studentTicketRepo.save(studentTicket);
        StudentTicketDto studentTicketDto = studentTicketMapper.toDto(studentTicket);
        return studentTicketDto;
    }

    @Override
    public StudentTicketDto delete(Long id) {
        StudentTicket studentTicket = studentTicketRepo.findById(id).orElseThrow(()-> new RuntimeException("Такой студент не найден"));
        studentTicket.setActive(StudentTicketActive.NO);
        studentTicketRepo.save(studentTicket);
        return studentTicketMapper.toDto(studentTicket);
    }
}
