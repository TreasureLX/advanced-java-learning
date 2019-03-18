package com.lx.learning.designpattern.singleton.serial;

import com.lx.learning.designpattern.singleton.enumeration.EnumSingleton;

public class EnumSingletonSerialTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        byte[] bytes = SerialUtil.serial(singleton);
        EnumSingleton hungrySingleton1 = SerialUtil.deSerial(bytes);
        EnumSingleton hungrySingleton2 = SerialUtil.deSerial(bytes);
        System.out.println(hungrySingleton1 == hungrySingleton2);
    }
}
