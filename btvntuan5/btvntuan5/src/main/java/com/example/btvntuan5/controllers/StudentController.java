package com.example.btvntuan5.controllers;

import com.example.btvntuan5.models.Student;
import com.example.btvntuan5.services.Impl.StudentServiceImpl;
import com.example.btvntuan5.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/student")
@RequiredArgsConstructor

public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllUsers")
    public List<Student> getAllUsers() {
        return studentService.findAll();
    }

}
