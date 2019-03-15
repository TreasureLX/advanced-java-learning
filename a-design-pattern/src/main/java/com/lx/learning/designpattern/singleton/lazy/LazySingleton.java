package com.lx.learning.designpattern.singleton.lazy;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() { }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
