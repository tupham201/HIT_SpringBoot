package com.example.ktra.repository;

import com.example.ktra.dto.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
