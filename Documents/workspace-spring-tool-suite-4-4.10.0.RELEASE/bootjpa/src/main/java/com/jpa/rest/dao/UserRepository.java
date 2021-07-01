package com.jpa.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.rest.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	

	
}
