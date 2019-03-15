package com.lx.learning.designpattern.singleton.lazy;

/**
 * 懒加载+防止反射+防止反序列化
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if ( LazyHolder.instance != null ){
            throw  new RuntimeException("单例已存在，不允许重新创建");
        }
    }

    public LazyInnerClassSingleton getInstance(){
        return LazyHolder.instance;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton instance=new LazyInnerClassSingleton();
    }
}
