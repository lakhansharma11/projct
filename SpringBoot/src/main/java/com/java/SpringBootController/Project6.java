package com.java.SpringBootController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project6 {
	
	@RequestMapping("/hello")
	public  String sayHello()
	{
		return "Hello Spring Boot Application";
	}

}
