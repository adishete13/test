package com.assignment.questions;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;

@Controller
public class loginController {
	
	@GetMapping("/login")
	public String login() {
		return "home.jsp";
	}

}
