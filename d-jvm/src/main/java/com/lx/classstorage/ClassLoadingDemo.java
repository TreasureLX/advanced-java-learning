package com.lx.classstorage;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

public class ClassLoadingDemo {
    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println(System.getProperty("user.dir"));
        //D:/commomproject/advanced-java-learning
        //当前工程绝对路径：${user.dir}/d-jvm
        //ClassPath：${user.dir}/d-jvm/target/classes
        String className="com.lx.classstorage.User";
        String classFileName=className.replace(".","/").concat(".class");
        String classPath=System.getProperty("user.dir")+"/d-jvm/target/classes";
        File file=new File(classPath,classFileName);
        System.out.println(file);
        MyClassLoader myClassLoader=new MyClassLoader();
        Class clazz=myClassLoader.defineClass(className,file);
        System.out.println(clazz.getClassLoader());
        Stream.of(clazz.getDeclaredFields()).forEach(
                field -> {
                    System.out.println(field.toString());
                }
        );

        ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
        Class user=classLoader.loadClass(className);
        System.out.println(clazz==user);

        //替换ClassLoader
        Thread.currentThread().setContextClassLoader(myClassLoader);
        System.out.println(classLoader.loadClass(className)==user);
        
    }

    static class MyClassLoader extends ClassLoader{
        public MyClassLoader(){
            super(Thread.currentThread().getContextClassLoader());
        }

        public Class<?> defineClass(String name,File classFile){
            byte[] bytes=loadBytes(classFile);
            //用于动态加载
            return super.defineClass(name,bytes,0,bytes.length);
        }

        private byte[] loadBytes(File classFile) {
            try {
                byte[] bytes=FileUtils.readFileToByteArray(classFile);
                return bytes;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
