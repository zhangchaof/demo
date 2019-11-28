package com.example.demo.strategy;

import org.springframework.stereotype.Service;

@Service
public class StrategyInterfaceA implements StrategyInterface {

    @Override
    public void test() {
        System.out.println("---------- StrategyInterfaceA ------------ ");
    }
}
