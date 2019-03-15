package com.lx.learning.designpattern.singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() { }

    public LazyInnerClassSingleton getInstance(){
        return LazyHolder.instance;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton instance=new LazyInnerClassSingleton();
    }
}
