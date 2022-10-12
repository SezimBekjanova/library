package com.example.library.models.dto;

import com.example.library.models.enums.StudentTicketActive;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentTicketDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String photo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Date dateOfBirth;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    StudentTicketActive active;
}
