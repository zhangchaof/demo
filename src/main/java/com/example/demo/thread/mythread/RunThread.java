package com.example.demo.thread.mythread;

/**
 * @program: demo:RunThread
 * @description:
 * @author: zcf
 * @create: 2019-12-04 20:02
 **/
public class RunThread implements Runnable {

    @Override
    public void run() {
        System.out.println("RunThread = " );
    }

    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        Thread thread = new Thread(runThread,"test");
        thread.start();
    }
}
