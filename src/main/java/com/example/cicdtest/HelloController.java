package com.example.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final String MSG = "Hello";
    @GetMapping
    public String hello() {
        return MSG;
    }
}
