package com.example.library.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "archive")
public class Archive {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date startDate;
    Date endDate;
    @ManyToOne
    @JoinColumn(name = "id_student_ticket")
    StudentTicket studentTicket;
    @ManyToOne
    @JoinColumn(name = "id_book")
    Book book;

}
