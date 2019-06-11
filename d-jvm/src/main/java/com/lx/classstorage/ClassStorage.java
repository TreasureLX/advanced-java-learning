package com.lx.classstorage;

public class ClassStorage {
    public static void main(String[] args) {
        //系统ClassLoader
        System.out.println(ClassLoader.getSystemClassLoader());//只读
        //应用ClassLoader
        System.out.println(Thread.currentThread().getContextClassLoader());//可写

    }

    private static void loadClassByClassLoader(ClassLoader classLoader,String className){
        ClassLoader oldClassLoader=Thread.currentThread().getContextClassLoader();
        try{
            Thread.currentThread().setContextClassLoader(classLoader);

        }catch (Exception e){

        }finally {
            Thread.currentThread().setContextClassLoader(oldClassLoader);
        }

    }

}
