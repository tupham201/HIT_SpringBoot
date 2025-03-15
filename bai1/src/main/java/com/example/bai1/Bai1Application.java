package com.example.bai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bai1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bai1Application.class, args);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.drive();
    }
}
