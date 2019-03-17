package com.lx.learning.designpattern.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static Map<String, Object> container = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    private static Object getInstance(String name) {
        //如果容器中包含要去的单例则直接返回不创建单例了，这里使用是双重检测机制
        if (!container.containsKey(name)) {
            synchronized (ContainerSingleton.class){
                if (!container.containsKey(name)) {
                    try {
                        Class clazz = Class.forName(name);
                        Object obj = clazz.newInstance();
                        container.put(name, obj);
                        return obj;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return container.get(name);
    }

    public static void main(String[] args) {
        Object obj=getInstance("com.lx.learning.designpattern.singleton.container.User");
        System.out.println(obj);
    }
}
