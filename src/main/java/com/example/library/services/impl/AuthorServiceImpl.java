package com.example.library.services.impl;

import com.example.library.mappers.AuthorMapper;
import com.example.library.models.Author;
import com.example.library.models.dto.AuthorDto;
import com.example.library.repo.AuthorRepo;
import com.example.library.services.AuthorService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorMapper authorMapper;
    private final AuthorRepo authorRepo;

    public AuthorServiceImpl( AuthorRepo authorRepo) {
        this.authorMapper = AuthorMapper.INSTANCE;
        this.authorRepo = authorRepo;
    }

    @Override
    public AuthorDto save(AuthorDto authorDto) {
        Author author = findByName(authorDto.getName());
        if(Objects.isNull(author)) {
            authorRepo.save(authorMapper.toEntity(authorDto));
        }
        return authorMapper.toDto(author);
    }

    @Override
    public Author findByName(String name) {
        Author author = authorRepo.findByName(name);
        return author;
    }

    @Override
    public Author findById(Long id) {
        return authorRepo.findById(id).get();
    }
}
