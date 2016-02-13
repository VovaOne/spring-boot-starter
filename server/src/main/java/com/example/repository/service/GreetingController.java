package com.example.repository.service;

import java.util.concurrent.atomic.AtomicLong;

import com.example.repository.entity.Customer;
import com.example.repository.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    CustomerRepository repository;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Customer greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return repository.findAll().iterator().next();
    }

}
