package com.dean.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	@ResponseBody
	public String first() {
		return "Hello~~";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
		
		
	}

}
