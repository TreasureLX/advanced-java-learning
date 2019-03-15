package com.lx.learning.designpattern.singleton.test;

import com.lx.learning.designpattern.singleton.enumeration.EnumSingleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.printName();
    }
}
