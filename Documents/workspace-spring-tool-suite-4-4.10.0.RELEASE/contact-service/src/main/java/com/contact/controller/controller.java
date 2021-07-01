package com.contact.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.ContactServiceApplication;
import com.contact.dao.contactRepository;
import com.contact.entity.contact;

@RestController
public class controller {

	@Autowired
	contactRepository contactRepository;
	
	@GetMapping("call")
	public String display() {
		return "hiiiii";
		
	}
	
	contact contact=new contact();
	@GetMapping("details")
	public contact getdetailContact() {
		
		return contactRepository.findById(1).get();		
		
	}
	
	
	@PostMapping("save")
	public contact savedeatilContact(@RequestBody contact contact) {
		
		contact contact2=contactRepository.save(contact);
		return contact2;
	}
	
	
	
}
