package com.lx.learning.concurrency;

public class TestClassLoader extends ClassLoader {

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return String.class;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return String.class;
    }

    public static void main(String[] args) {
        Thread.currentThread().setContextClassLoader(new TestClassLoader());
        ClassLoader classLoader = getSystemClassLoader();
        System.out.println(classLoader);
    }

    static {
        i=10;
//        System.out.println(i);
    }

    static int i = 10;
}
