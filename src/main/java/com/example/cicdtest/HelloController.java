package com.example.cicdtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final String MSG = "Hello";

    @Value("${hello.msg}")
    private String msg;

    @GetMapping("/hello")
    public String hello() {
        return MSG;
    }

    @GetMapping("/hi")
    public String hi() {
        return msg;
    }
}
