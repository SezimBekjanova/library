package com.example.library.services;

import com.example.library.models.Author;
import com.example.library.models.dto.AuthorDto;

public interface AuthorService {
    AuthorDto save(AuthorDto authorDto);
    Author findByName(String name);
    Author findById(Long id);
}
