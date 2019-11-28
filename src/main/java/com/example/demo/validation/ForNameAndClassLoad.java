package com.example.demo.validation;

/**
 * @program: demo:ForNameAndClassLoad
 * @description:
 * @author: zcf
 * @create: 2019-11-23 11:24
 **/
public class ForNameAndClassLoad {

    public ForNameAndClassLoad() {
        System.out.println("----------- cat ---------");
    }

    static {
        System.out.println("1111111 = " + 1111111);
    }

    static String names = name();

    public static String name() {
        System.out.println("true = " + true);
        return "name";
    }
}
