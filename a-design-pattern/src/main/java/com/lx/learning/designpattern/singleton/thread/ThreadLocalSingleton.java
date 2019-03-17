package com.lx.learning.designpattern.singleton.thread;

public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){
    }

    private static final ThreadLocal<ThreadLocalSingleton> instance=
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance(){
        return instance.get();
    }
}
