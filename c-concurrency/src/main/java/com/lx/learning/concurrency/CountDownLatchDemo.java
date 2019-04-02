package com.lx.learning.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(30 * 1000);
                    System.out.println("Thread1");
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5 * 1000);
                    System.out.println("Thread2");
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            countDownLatch.await();
            System.out.println("main方法执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
