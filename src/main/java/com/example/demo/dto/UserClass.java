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

    public static void main(String[] args) throws Exception {
        String className = "com.example.demo.dto.UserClass";
         ClassLoader.getSystemClassLoader().loadClass(className);
        System.out.println("------------ " );
        Class.forName(className);


    }
}
