package com.lx.classstorage;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        getClassLoader(ClassLoaderDemo.class);
    }

    private static void getClassLoader(Class clazz){
        System.out.println(clazz.getClassLoader());
    }
}
