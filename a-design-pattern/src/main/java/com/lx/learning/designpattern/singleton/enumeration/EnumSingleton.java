package com.lx.learning.designpattern.singleton.enumeration;

public enum EnumSingleton {
    INSTANCE,
    INSTANCE2;
    private String name;

    public void printName() {
        System.out.println(name);
    }

    EnumSingleton() {
    }

    public void setName(String name) {
        this.name = name;
    }
}
