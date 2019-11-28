package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRun {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/auto/home")
    public String home(){
        return helloService.say();
    }
}
