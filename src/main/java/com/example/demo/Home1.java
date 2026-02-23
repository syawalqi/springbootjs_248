package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home1 {
    @GetMapping("/hi")
    public String Home1(){
        return "<h1>Welcome to the deployment class</h1>" +
                "<p>This is a simple spring boot app.</p>";
    }
}
