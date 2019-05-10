package com.lx.learning.concurrency;

public class WaitJoinDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Hello world1");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Hello world2");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("Hello world3");
        });
        t.start();
        t2.start();
        t3.start();
        while (t.isAlive()) {
            Thread.sleep(0);
        }

        while (t2.isAlive()) {
            Thread.sleep(0);
        }
        while (t3.isAlive()) {
            Thread.sleep(0);
        }
        System.out.println("执行完毕");
    }


}
