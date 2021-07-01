package com.jpa.rest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.jpa.rest.dao.UserRepository;
import com.jpa.rest.entity.User;


@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context=SpringApplication.run(BootjpaApplication.class, args);
		//UserRepository userRepository=context.getBean(UserRepository.class);
		/*
		 * User user=new User(); user.setCity("Pune"); user.setName("Rajan");
		 * user.setStatus("SAP"); User user1=userRepository.save(user);
		 */
		 
     
	}
	 @Bean
	 @LoadBalanced
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
