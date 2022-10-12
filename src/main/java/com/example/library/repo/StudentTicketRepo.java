package com.example.library.repo;

import com.example.library.models.StudentTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentTicketRepo extends JpaRepository<StudentTicket, Long> {
}
