package com.neeraj.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("secure/api")
    String secure(){
        return "I am secure";
    }
}
