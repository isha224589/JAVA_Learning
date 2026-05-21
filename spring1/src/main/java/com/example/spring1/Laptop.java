package com.example.spring1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

	public void compile() {
		System.out.println("Laptop is compiling");
	}
}
