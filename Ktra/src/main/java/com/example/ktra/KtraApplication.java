package com.example.ktra;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KtraApplication {

	public static void main(String[] args) {
		SpringApplication.run(KtraApplication.class, args);
	}

	@Bean
	public CommandLineRunner checkContext(ApplicationContext ctx) {
		return args -> {
			System.out.println("Beans loaded:");
			for (String name : ctx.getBeanDefinitionNames()) {
				if (name.contains("author")) {
					System.out.println("-> " + name);
				}
			}
		};
	}

}
