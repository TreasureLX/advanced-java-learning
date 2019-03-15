package com.lx.learning.designpattern.singleton.enumeration;

public enum EnumSingleton {
    INSTANCE;
    private String name;

    public void printName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
