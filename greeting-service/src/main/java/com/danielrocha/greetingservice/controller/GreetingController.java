package com.danielrocha.greetingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielrocha.greetingservice.service.GreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Autowired
	private GreetingService service;

	@GetMapping
    public String greet() {
		return service.getGreeting();
    }
	
}
