package com.example.demo.stream.vo;

import com.example.demo.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class DemoTest {
    @Test
    public void testLen() {
        System.out.println("\"1034268914713886720\".length() = " + "1034268914713886720".length());
    }

    @Test
    public void get() {
        PayPlatformEnum enumByCode = PayPlatformEnum.getEnumByCode("11");
        System.out.println("\"wx05a6da34898c1349\".length() = " + "wx05a6da34898c1349".length());
    }

    @Test
    public void countTicket() {
        String[] strs = new String[]{"s1", "s2"};
        List<String> list = Arrays.asList(strs);
        System.out.println("list.contains(\"s1\") = " + list.contains("s1"));
        System.out.println("strs = " + strs.length);
        Integer[] inta = new Integer[4];
        System.out.println("Arrays.asList(inta).size() = " + Arrays.asList(inta).size());
    }

    @Test
    public void testInt() {
        Integer o = new Integer(1);
        System.out.println("(1==l) = " + (1 == o));
    }

    @Test
    public void testSetter() {
        User user = new User("zhangsan", 1);
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.setAge(user.getAge());
            user.setName(user.getName());
        }
        System.out.println("System.currentTimeMillis() - start() = " + (System.currentTimeMillis() - start));

        Long start2 = System.currentTimeMillis();
        String name = user.getName();
        int age = user.getAge();
        for (int i = 0; i < 1000000000; i++) {
            user.setAge(age);
            user.setName(name);
        }
        System.out.println("System.currentTimeMillis() - start() = " + (System.currentTimeMillis() - start2));
    }

    @Test
    public void testStopWatch() throws InterruptedException {
        //调用的类名
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        String className = stackTraceElement.getClassName();
        //调用的方法名
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        //调用的行数
        int lineNumber = stackTraceElement.getLineNumber();
        String watchName = getClass().getName() + " testStopWatch";
        StopWatch stopWatch = new StopWatch(watchName);
        stopWatch.start("sec");
        Thread.sleep(1000L);
   //     stopWatch.stop();
//        stopWatch.start("任务2");
//        Thread.sleep(2000L);
        stopWatch.stop();
       log.info( stopWatch.prettyPrint());
    }

}
