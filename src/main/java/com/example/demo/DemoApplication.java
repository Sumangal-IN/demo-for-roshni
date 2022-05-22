package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

// Map<String, Integer>  key -> value
	// "a"->3
	// "b"->5

// Multivalued Map<String, Integer>
	// "a" -> [3,5]
	// "b" -> [9]
	// "c" -> [98,100,45]
}
