package com.example.greetingapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> getGreeting(){
        return ResponseEntity.ok("Welcome from Docker");
    }
}
