package com.lx.learning.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {

                        System.out.println("hello");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
//            Thread.sleep(10*1000);
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
