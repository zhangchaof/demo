package com.example.demo;

import com.example.demo.autowired.TestAbstract;
import com.example.demo.strategy.StrategyInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private TestAbstract testAbstract;

    @Autowired
    Map<String, StrategyInterface> map;

    @Test
    public void contextLoads() {
        testAbstract.tes();
    }

    @Test
    public void testStrage() {
        System.out.println("map = " + map);
    }

    @Test
    public void testStopWatch() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("执行任务");
        Thread.sleep(1000L);
        stopWatch.stop();
        stopWatch.start("任务2");
        Thread.sleep(2000L);
        stopWatch.stop();
        System.out.println("stopWatch = " + stopWatch.prettyPrint());
    }
}

