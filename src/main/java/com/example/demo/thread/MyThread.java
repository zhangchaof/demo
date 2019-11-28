package com.example.demo.thread;

public class MyThread extends Thread {


    @Override
    public void run() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.setName("myThread1");
        myThread.start();
    }
}
