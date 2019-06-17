package com.lanxing.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FailFastAndFailSafeDemo {
    private final static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
//        demoFailSafe();
        try {
            lock.tryLock();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    private static void demoFailSafe() {
        List<String> list = new CopyOnWriteArrayList<>(Arrays.asList("a", "b", "c"));
        try {
            for (String str : list) {
                list.remove(str);
            }
        } catch (ConcurrentModificationException e) {
//            e.printStackTrace();
            System.out.println("FailFast异常");
        }
    }

    private static void demoFailFast() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        try {
            for (String str : list) {
                list.remove(str);
            }
        } catch (ConcurrentModificationException e) {
//            e.printStackTrace();
            System.out.println("FailFast异常");
        }
    }
}
