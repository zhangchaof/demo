package com.example.demo.service.impl;

import com.example.demo.service.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public void doService() {
        System.out.println("\"myService\" = " + "myService");
    }
}
