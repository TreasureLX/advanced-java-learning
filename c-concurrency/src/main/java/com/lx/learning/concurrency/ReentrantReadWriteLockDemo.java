package com.lx.learning.concurrency;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockDemo {
    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static Lock readLock = lock.readLock();
    private static Lock writeLock = lock.writeLock();
    private static HashMap data = new HashMap<String, Object>();

    public static Object getData(String key) {
        readLock.lock();
        Object object = data.get(key);
        readLock.unlock();
        return object;
    }

    public static Object putData(String key, Object obj) {
        writeLock.lock();
        Object object = data.put(key, obj);
        writeLock.unlock();
        return object;
    }
}
