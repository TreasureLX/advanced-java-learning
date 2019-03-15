package com.lx.learning.designpattern.singleton.lazy;

public class SafeLazySingleton {
    private static SafeLazySingleton instance = null;

    private SafeLazySingleton() {
        if (instance != null){
            throw  new RuntimeException("单例已存在，不允许重新创建");
        }
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
