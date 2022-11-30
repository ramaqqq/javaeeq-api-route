package com.domain.eeq.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/eeq")
public class WelcomeController {

    @GetMapping
    public String Hello() {
        return "Hello";
    }



}
