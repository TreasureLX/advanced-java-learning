package com.lx.learning.concurrency;

public class WaitJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            System.out.println("Hello world");
        });
        t.start();
        System.out.println(t.isAlive());
        while (t.isAlive()){
            //线程获得t的monitor对象
            synchronized (t){
                //执行这个代码的是主线程，所以阻塞的是主线程
//                t.wait(0);
                Thread.sleep(0);
            }
        }
        System.out.println(t.isAlive());
    }


}
