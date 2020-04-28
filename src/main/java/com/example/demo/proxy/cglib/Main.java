package com.example.demo.proxy.cglib;

/**
 * @program: demo:Main
 * @description:
 * @author: zcf
 * @create: 2020-03-12 09:38
 **/
public class Main {
    public static void main(String[] args) {
        // CGLIB 动态代理调用
        CglibProxy proxy = new CglibProxy();
        Panda panda = (Panda) proxy.getInstance(new Panda());
        panda.eat();
    }
}
