package com.example.bai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Bai1Application {

    public static void main(String[] args) {
        SpringApplication.run(Bai1Application.class, args);
    }
    @RequestMapping(value = {"/" ,""})
    public String home(){
        System.out.println("dmasdf");
        return "redirect:/employees/select" ;
    }
}
