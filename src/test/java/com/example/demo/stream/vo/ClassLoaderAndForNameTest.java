package com.example.demo.stream.vo;

import org.junit.Test;

/**
 * @author clark
 * @Description:
 * @date 2020/4/16 11:37
 */
public class ClassLoaderAndForNameTest {

    @Test
    public void testClass1() throws Exception {
        String className = "com.example.demo.dto.UserClass";
        ClassLoader.getSystemClassLoader().loadClass(className);
    }

    @Test
    public void testClass2() throws Exception {
        String className = "com.example.demo.dto.UserClass";
         Class.forName(className, false, this.getClass().getClassLoader());
    }
}
