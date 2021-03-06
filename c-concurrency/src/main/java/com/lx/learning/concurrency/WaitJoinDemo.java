package com.lx.learning.concurrency;

public class WaitJoinDemo {
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
            synchronized (t){
                t.wait(0);
            }
        }

        while (t2.isAlive()) {
            synchronized (t2) {
                t2.wait(0);
            }
        }
        while (t3.isAlive()) {
            synchronized (t3){
                t3.wait(0);
            }
        }
        System.out.println("执行完毕");
    }


}
