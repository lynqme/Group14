package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome{

    @GetMapping("/hello")
    public String String_welcome(){
        return "Welcome!";
    }
}
