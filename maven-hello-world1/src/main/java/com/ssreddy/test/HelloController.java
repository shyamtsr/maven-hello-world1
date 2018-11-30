package com.ssreddy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World, Welcome to Spring Boot! ";
	}

	@GetMapping("/test")
	public String test() {
		return "Hello World, Welcome to Book World...";
	}

}
