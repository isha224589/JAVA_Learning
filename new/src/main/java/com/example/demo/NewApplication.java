package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class NewApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(NewApplication.class, args);
		Hello obj = context.getBean(Hello.class);
		obj.code();
	}

}
