package com.example.musicapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/subsection")
    public String subSection() {
        return "you called the endpoint /helloworld/subsection";
    }
}
