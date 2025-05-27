package com.example.btvntuan5.services;

import com.example.btvntuan5.models.Student;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public List<Student> findAll();
    public Student findById(Long id);
    public Student save(Student student);
    public Student update(Student student);
    public void delete(Student student);
}
