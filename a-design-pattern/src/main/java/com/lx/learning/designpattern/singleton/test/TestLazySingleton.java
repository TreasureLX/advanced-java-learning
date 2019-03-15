package com.lx.learning.designpattern.singleton.test;

public class TestLazySingleton {
    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            new SingletonThread().start();
        }
    }
}
