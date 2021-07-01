package com.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBcakController {

	@RequestMapping("/userFallBack")
	public Mono<String> userserviceFallBack(){
		return Mono.just("User Service is taking too long to respond or is down."); 
	
	}
	
	@RequestMapping("/contactFallback")
	public Mono<String> contactserviceFallBack(){
		return Mono.just("Contact Service is taking too long to respond or is down."); 
	
	}
}
