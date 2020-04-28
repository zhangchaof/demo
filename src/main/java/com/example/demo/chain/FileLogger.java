package com.example.demo.chain;

/**
 * @author clark
 * @Description:
 * @date 2020/4/16 19:03
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}