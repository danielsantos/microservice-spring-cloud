package com.danielrocha.usergreetingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielrocha.usergreetingservice.consumer.GreetingConsumer;

@Service
public class UserGreetingService {
	
	private final GreetingConsumer greetingConsumer;

    @Autowired
    public UserGreetingService(GreetingConsumer greetingConsumer) {
        this.greetingConsumer = greetingConsumer;
    }

    public String sayHelloToUser(String username) {
        String greeting = greetingConsumer.getRandomGreeting();
        return greeting + " " + username + "!";
    }

}
