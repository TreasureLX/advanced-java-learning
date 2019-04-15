package com.lx.learning.concurrency;

public class ThreadStartDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
        t.start();


    }
}
