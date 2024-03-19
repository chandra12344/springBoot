package com.example.demo2.demo2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class Controller {

    @GetMapping("/get")
    public String doGet() {
        return "Hello I'm get api";
    }
    @PostMapping("/post")
    public String doPost() {
        return "Hello I'm post api";
    }
    
    

}
