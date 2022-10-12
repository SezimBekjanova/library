package com.example.library.controllers;

import com.example.library.microservice.json.Response;
import com.example.library.models.StudentTicket;
import com.example.library.models.dto.StudentTicketDto;
import com.example.library.services.StudentTicketService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("StudentTicket")
public class StudentTicketController {
    private final StudentTicketService studentTicketService;


    public StudentTicketController(StudentTicketService studentTicketService) {
        this.studentTicketService = studentTicketService;
    }

    @PostMapping("/add")
    public StudentTicketDto save(@RequestBody StudentTicketDto studentTicketDto){
        return studentTicketService.add(studentTicketDto);
    }
    @GetMapping("/add/photo")
    public Response  savePhoto(@RequestPart MultipartFile file){
        return studentTicketService.addPhoto(file);
    }

    @PostMapping("/add/photo1")
    public  StudentTicketDto savePhoto1(@RequestParam Long id,@RequestPart MultipartFile file){
        StudentTicket studentTicket = studentTicketService.findById(id);
        return studentTicketService.addPhoto1(studentTicket, file);
    }
    @GetMapping("/info")
    public StudentTicket getStudent(@RequestParam Long id) {
        return studentTicketService.findById(id);
    }
    @PostMapping("/delete")
    public StudentTicketDto deleteStudent(@RequestParam Long id){
        return  studentTicketService.delete(id);
    }

}
