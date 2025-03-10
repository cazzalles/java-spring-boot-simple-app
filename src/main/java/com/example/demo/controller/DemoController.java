package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Message;
import com.example.demo.services.DemoService;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService; 

    @GetMapping("/hi")
    public String sayHi() {
        return this.demoService.sayHi(); 
    }

    @PostMapping("/message")
    public String handleMessage(@RequestBody Message message) {
        return this.demoService.handleMessage(message);
    }
    
}
