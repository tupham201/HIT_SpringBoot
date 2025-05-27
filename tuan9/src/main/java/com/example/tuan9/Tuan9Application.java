package com.example.tuan9;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tuan9Application {

    public static void main(String[] args) {
        SpringApplication.run(Tuan9Application.class, args);
    }
    @Bean
    public CommandLineRunner checkContext(ApplicationContext ctx) {
        return args -> {
            System.out.println("Beans loaded:");
            for (String name : ctx.getBeanDefinitionNames()) {
                if (name.contains("user")) {
                    System.out.println("-> " + name);
                }
            }
        };
    }
}
