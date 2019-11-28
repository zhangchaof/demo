package com.example.demo.autowired;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class Abstract implements InterfaceTest{
    @Autowired
    protected MyService myService;
    @Value("${hello.msg}")
    private String msg;

    @Override
    final public void test() {
        System.out.println("Abstract msg = " + msg);
    }
}
