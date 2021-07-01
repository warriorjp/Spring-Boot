package com.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class ThymleafPracticalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymleafPracticalApplication.class, args);
		System.out.println("Hiiii");
	}

}
