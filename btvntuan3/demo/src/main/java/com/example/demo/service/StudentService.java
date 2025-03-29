package com.example.demo.service;

import com.example.demo.entities.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student add(Student student);
    public Student update(Student student);
    public void delete(Student student);

}
