package com.lx.learning.designpattern.singleton.test;

import com.lx.learning.designpattern.singleton.enumeration.EnumSingleton;

import java.lang.reflect.Constructor;

public class ReflectEnumSingleton2 {
    public static void main(String[] args) {
        Class<EnumSingleton> clazz = EnumSingleton.class;
        try {
            //1.获取单例的构造器
            Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class,int.class);
            //2.因为构造器为私有的，所以要设置成私有可以被反射访问
            constructor.setAccessible(true);
            //3.通过反射生成两个对象
            EnumSingleton singleton1 = constructor.newInstance("lx",0);
            EnumSingleton singleton2 = constructor.newInstance("lx",0);
            //4.输出这两个对象的HashCode
            System.out.println("Singleton1 hashCode==>" + singleton1.hashCode());
            System.out.println("Singleton2 hashCode==>" + singleton2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
