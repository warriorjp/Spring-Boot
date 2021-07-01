package com.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class Message {

	@Value("${message: default hello....}")
	private String message;
	
	@GetMapping("/test")
	public String message() {
		return message;
	}
	
}
