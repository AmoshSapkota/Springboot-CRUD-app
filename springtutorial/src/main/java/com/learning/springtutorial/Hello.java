package com.learning.springtutorial;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Hello {
    @GetMapping("/")
    public String greet() {
        return "Hello, World!";
    }
}
