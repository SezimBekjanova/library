package com.example.library.models;

import com.example.library.models.enums.StudentTicketActive;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "student_ticket")
public class StudentTicket {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String photo;
    String name;
    String address;
    @Column(name = "date_of_birth")
    Date dateOfBirth;
    @Enumerated(value = EnumType.STRING)
    StudentTicketActive active;
}
