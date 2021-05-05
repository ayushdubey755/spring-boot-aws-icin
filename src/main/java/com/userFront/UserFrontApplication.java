package com.userFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserFrontApplication {
	
	public String home() {
	return "welcome to spring boot deployment....!";	
	}

	public static void main(String[] args) {
		SpringApplication.run(UserFrontApplication.class, args);
	}
}
