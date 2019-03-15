package com.lx.learning.designpattern.singleton.test;

import com.lx.learning.designpattern.singleton.lazy.LazySingleton;

public class SingletonThread extends Thread {

    @Override
    public void run() {
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println("HashCode==>"+lazySingleton.hashCode());
    }
}
