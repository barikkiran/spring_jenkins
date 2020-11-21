package com.spring.jenkins.test.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/welcome")
public class WelcomeController {

	private final static Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);
	
	
	@GetMapping(path = "/greeting")
	public String greeting() {
		
		LOGGER.info("greeting method invoke");

		return "Good Evening....!";
	}	
	
	
}
