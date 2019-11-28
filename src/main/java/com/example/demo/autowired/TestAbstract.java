package com.example.demo.autowired;

import org.springframework.stereotype.Component;

@Component
public class TestAbstract extends  Abstract{

    public void tes() {
        test();
        System.out.println("TestAbstract msg = " + myService);
    }
}
