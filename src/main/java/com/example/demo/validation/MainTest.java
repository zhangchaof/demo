package com.example.demo.validation;

/**
 * @program: demo:MainTest
 * @description:
 * @author: zcf
 * @create: 2019-11-23 11:45
 **/
public class MainTest {
    public static void main(String[] args) throws Exception {
        String className = "com.example.demo.validation.ForNameAndClassLoad";
        Class.forName(className);
        System.out.println("222 = " + 222);
        ClassLoader.getSystemClassLoader().loadClass(className);

    }
}
