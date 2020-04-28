package com.example.demo.chain;

/**
 * @author clark
 * @Description:
 * @date 2020/4/16 19:02
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}