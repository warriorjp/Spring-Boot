package com.jpa.rest.controler;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jpa.rest.dao.UserRepository;
import com.jpa.rest.entity.User;
import com.jpa.rest.entity.contact;

@RestController
@RequestMapping("/User")
public class restcontroler {

	@Autowired
	private  UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	 
	User book=new User();
	@GetMapping("/book")
	public contact getBook() {
		
		User user = this.userRepository.findById(6).get();
		contact user1=this.restTemplate.getForObject("http://CONTACT-SERVICE/details", contact.class);
	    //List contact=this.restTemplate.getForObject("http://localhost:9002/details", List.class);
	    
		return user1;
	}
	
	@PostMapping("/books")
	public User addBook(@RequestBody User book) {
		User book1=userRepository.save(book);
		return book1;
	}
	
	@GetMapping("/call")
	public String UserService() {
		return "User Service Activated";
	}

	
	
}
