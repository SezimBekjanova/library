package com.example.library.repo;

import com.example.library.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    Book findByTitle(String title);
    @Transactional
    @Modifying
    @Query(value = "update books set amount where id=?1", nativeQuery = true)
    void update(Long id);
    @Transactional
    @Modifying
    @Query(value = "SELECT * FROM where title=?1", nativeQuery = true)
    void findByTitle1(String title);

}
