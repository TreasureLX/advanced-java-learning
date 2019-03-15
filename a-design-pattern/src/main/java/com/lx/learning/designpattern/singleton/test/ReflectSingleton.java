package com.lx.learning.designpattern.singleton.test;

import com.lx.learning.designpattern.singleton.hungry.HungrySingleton;
import com.lx.learning.designpattern.singleton.lazy.SafeLazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectSingleton {

    public static void main(String[] args) {
        Class<HungrySingleton> clazz=HungrySingleton.class;
        try {
            Constructor<HungrySingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            HungrySingleton singleton1=constructor.newInstance();
            HungrySingleton singleton2=constructor.newInstance();
            System.out.println("Singleton1 hashCode==>"+singleton1.hashCode());
            System.out.println("Singleton2 hashCode==>"+singleton2.hashCode());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
