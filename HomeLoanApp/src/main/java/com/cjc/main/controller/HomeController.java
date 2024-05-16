package com.cjc.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HomeController {
	
	
	@PostMapping("/register_enquiry")
	public String saveEqnuiry()
	{
		 
		return "Enquiry Saved";
	}
	@GetMapping("/view_enquiries");
	publlic List getAllEnquiries()
	{
            return null;
	}
}
