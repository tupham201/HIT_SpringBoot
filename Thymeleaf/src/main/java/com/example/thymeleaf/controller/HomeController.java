package com.example.thymeleaf.controller;


import com.example.thymeleaf.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        List<User> users = new ArrayList<>();
        users.add(new User(2,"tu"));
        users.add(new User(6,"tuu"));
        model.addAttribute("name", "Spring Boot");
        model.addAttribute("users", users);
        return "index";
    }
}
