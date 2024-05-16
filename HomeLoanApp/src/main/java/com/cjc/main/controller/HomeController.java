package com.cjc.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@PostMapping("/register_enquiry")
	public String saveEqnuiry()
	{
		 
		return "Enquiry Saved";
	}
}
