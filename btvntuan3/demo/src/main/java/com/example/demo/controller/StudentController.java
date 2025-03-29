package com.example.demo.controller;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.Impl.StudentServiceImpl;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
@Log4j2
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @GetMapping("/")
    public String find(Model model) {
        List<Student> students = studentRepository.findAll();
        students.add(new Student(1,"tu","Mihow","0966","NĐ"));
        model.addAttribute("students", students);
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Student student, Model model ) {
        studentRepository.save(student);
        model.addAttribute("student", new Student());
        return "redirect:/student/";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        log.error("delete");

        studentRepository.deleteById(id);
        return "redirect:/student/" ;
    }
}
