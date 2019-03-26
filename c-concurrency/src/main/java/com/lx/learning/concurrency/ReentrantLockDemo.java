package com.lx.learning.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        tryLockInTimeOut();
    }

    private static void tryLockInTimeOut(){
        ReentrantLock lock=new ReentrantLock();
        try {
            lock.tryLock(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
