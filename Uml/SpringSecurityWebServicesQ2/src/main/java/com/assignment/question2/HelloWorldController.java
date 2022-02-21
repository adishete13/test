package com.assignment.question2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/public")
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
//	@GetMapping("/")
//	public String helloWorld1() {
//		return "Welcome in Spring Security!!!!";
//	}
//	
//	@GetMapping("/user")
//	public String HelloWorld2() {
//		return "Welcome User!!";
//	}
//	
//	@GetMapping("/admin")
//	public String HelloWorld3() {
//		return "Welcome Admin!!";
//	}

}

