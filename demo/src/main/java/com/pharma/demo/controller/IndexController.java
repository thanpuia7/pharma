package com.pharma.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexController {

	
	@GetMapping("/index")
	public String sayHello() {
		
		
		
		return "/form/index";
	}
	
}
