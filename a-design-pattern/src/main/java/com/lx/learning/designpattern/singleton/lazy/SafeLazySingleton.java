package com.lx.learning.designpattern.singleton.lazy;

public class SafeLazySingleton {
    private static SafeLazySingleton instance = null;

    private SafeLazySingleton() {

    }

    public static SafeLazySingleton getInstance() {
        if (instance == null) {
            synchronized (SafeLazySingleton.class) {
                if (instance == null) {
                    instance = new SafeLazySingleton();
                }
            }
        }
        return instance;
    }

}
