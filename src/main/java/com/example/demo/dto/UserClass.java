package com.example.demo.dto;

public class UserClass {
    static {
        System.out.println("1111111 = " + 1111111);
    }
    static String names = name();

    public static String name() {
        System.out.println("true = " + true);
        return "name";
    }

    public UserClass() {
        System.out.println("111 = " + 111);
    }
}
