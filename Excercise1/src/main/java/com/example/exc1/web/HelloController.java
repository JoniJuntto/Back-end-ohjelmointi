package com.example.exc1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	

	@RequestMapping("/index")
	public String hello() {
		return "This is the main page";
		
	}
	@RequestMapping("/contacts")
	public String heh() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String addHello(@RequestParam(name = "location") String location, @RequestParam String name) { 
	    return "Welcome to the " + " " + location + " " + name;
	}

}
