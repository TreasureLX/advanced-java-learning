package com.lx.learning.designpattern.singleton.hungry;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        if (instance != null){
            throw  new RuntimeException("单例已存在，不允许重新创建");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    private Object readResolve(){
        return getInstance();
    }

}
