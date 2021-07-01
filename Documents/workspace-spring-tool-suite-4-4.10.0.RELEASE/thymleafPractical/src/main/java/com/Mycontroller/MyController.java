package com.Mycontroller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class MyController {

	@RequestMapping(value = "about")
	public String about() {
		System.out.println("about");
		return "about";
	}
}
