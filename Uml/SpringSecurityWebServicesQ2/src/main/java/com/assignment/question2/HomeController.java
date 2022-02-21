package com.assignment.question2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HomeController {
	
	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	
//	@GetMapping("/logout-success")
//	public String logoutPage() {
//		return "logout.jsp";
//	}

}
