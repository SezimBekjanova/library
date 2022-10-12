package com.example.library.repo;

import com.example.library.models.AuthorTheBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorTheBookRepo extends JpaRepository<AuthorTheBook, Long> {
    AuthorTheBook findByBookId(Long id);
}
