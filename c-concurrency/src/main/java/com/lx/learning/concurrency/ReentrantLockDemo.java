package com.lx.learning.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    static ReentrantLock lock=new ReentrantLock();
    static Condition condition1=lock.newCondition();
    public static void main(String[] args) throws InterruptedException {
//        lock.lock();
        //Condition必须在加锁后使用
//        condition1.await();
//        condition1.signal();
//        lock.unlock();
//        tryLockInTimeOut();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    condition1.await();
                    Thread.sleep(5 * 1000);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(1 * 1000);
        lock.lock();
        //Condition必须在加锁后使用
        condition1.signal();
        condition1.signal();
        lock.unlock();

    }

    private static void tryLockInTimeOut(){
        ReentrantLock lock=new ReentrantLock();
        Condition condition1=lock.newCondition();
        try {
            lock.tryLock(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

