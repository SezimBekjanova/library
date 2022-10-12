package com.example.library.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String title;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Date releaseDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    int amount;


}
