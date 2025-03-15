package com.example.bai2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bai2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Bai2Application.class, args);
		Customer customer = ctx.getBean(Customer.class);
		customer.oderFastFood();
		customer.oderHealthyFood();
	}

}
