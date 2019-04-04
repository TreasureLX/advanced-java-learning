package com.lx.learning.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10*1000);
                        System.out.println("hello");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {

                        System.out.println("hello2");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
