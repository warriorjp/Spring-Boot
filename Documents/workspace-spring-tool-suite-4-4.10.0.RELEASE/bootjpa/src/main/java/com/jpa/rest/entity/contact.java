package com.jpa.rest.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String mail;
	private String address;
	public contact(int id, String mail, String address) {
		super();
		this.id = id;
		this.mail = mail;
		this.address = address;
		
		
	}
	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
