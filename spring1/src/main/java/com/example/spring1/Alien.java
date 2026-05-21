package com.example.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

	@Autowired
	private Laptop laptop;

	public void code() {
		laptop.compile();
	}
}
