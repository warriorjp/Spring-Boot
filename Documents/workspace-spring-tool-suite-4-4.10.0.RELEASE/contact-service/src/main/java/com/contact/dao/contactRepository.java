package com.contact.dao;



import org.springframework.data.repository.CrudRepository;

import com.contact.entity.contact;

public interface contactRepository extends CrudRepository<contact,Integer>{

}
