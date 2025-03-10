package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.domain.Message;

@Service
public class DemoService {

    protected String greeting; 

    public DemoService() {
        this.greeting = "Hi!"; 
    }

    public String sayHi() {
        return this.greeting; 
    }

    public String handleMessage(@RequestBody Message msg) {
        return "Received message: " + msg.getText(); 
    }
}
