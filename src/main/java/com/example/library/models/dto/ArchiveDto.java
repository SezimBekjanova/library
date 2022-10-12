package com.example.library.models.dto;

import com.example.library.models.Book;
import com.example.library.models.StudentTicket;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArchiveDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Date startDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Date endDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    StudentTicket studentTicket;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Book book;

}
