package com.lx.learning.concurrency;

/**
 * Created by Administrator on 2019/4/14.
 */
public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(() -> {
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                //发生异常后状态会被清除
                System.out.println(Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupted();
                System.out.println(Thread.currentThread().isInterrupted());
                e.printStackTrace();
            }
        });
        t.start();
        Thread.sleep(1 * 1000);
        t.interrupt();

    }
}
