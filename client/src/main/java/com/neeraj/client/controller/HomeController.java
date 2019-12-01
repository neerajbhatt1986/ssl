package com.neeraj.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("consume")
    String consume(){
        return restTemplate.getForObject("http://localhost:8080/secure/api", String.class);
    }
}
