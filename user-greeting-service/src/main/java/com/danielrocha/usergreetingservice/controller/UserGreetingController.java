package com.danielrocha.usergreetingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielrocha.usergreetingservice.service.UserGreetingService;

@RestController
@RequestMapping("/hello")
public class UserGreetingController {

    private final UserGreetingService service;

    @Autowired
    public UserGreetingController(UserGreetingService service) {
        this.service = service;
    }

    @GetMapping("/{username}")
    public String sayHello(@PathVariable String username) {
        return service.sayHelloToUser(username);
    }

}