package com.example.demo.guava;

import com.google.common.cache.CacheLoader;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: zcf
 * @Date: 2019/8/24 15:00
 */
public class GuavaCacheLoader extends CacheLoader<String, String> {

    private final ExecutorService executorService = Executors.newFixedThreadPool(4);

    @Override
    public String load(String s) {
        if (s.equals("hello")) {
            return "world";
        } else if (s.equals("world")) {
            return "hello";
        }
        return "no value";
    }

    @Override
    public ListenableFuture<String> reload(String key, String oldValue) throws Exception {
        ListenableFutureTask<String> task = ListenableFutureTask.create(new Callable<String>() {

            @Override
            public String call() throws Exception {
                if (key.equals("hello")) {
                    return "nihao";
                } else if (key.equals("world")) {
                    return "shijie";
                }
                return "no value";
            }
        });

        executorService.submit(task);
        return task;
    }
}