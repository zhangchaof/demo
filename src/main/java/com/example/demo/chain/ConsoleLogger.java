package com.example.demo.chain;

/**
 * @author clark
 * @Description:
 * @date 2020/4/16 19:01
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
