package com.lx.learning.designpattern.singleton.thread;

/**
 * Created by Administrator on 2019/3/17.
 */
public class TestThreadLocalSingleton {
    public static void main(String[] args) {
        Thread thread1=new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
            }
        },"thread1");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==================================================");
        Thread thread2= new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());
            }
        },"thread2");
        thread2.start();
    }

}
