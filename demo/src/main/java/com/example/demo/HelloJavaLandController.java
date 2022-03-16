package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloJavaLandController {
    @GetMapping(value="/")
    public String getHelloWorld() {
        return "Hello JavaLand!";
    }
    
}
