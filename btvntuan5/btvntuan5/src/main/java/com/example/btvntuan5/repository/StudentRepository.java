package com.example.btvntuan5.repository;

import com.example.btvntuan5.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
