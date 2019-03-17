package com.lx.learning.designpattern.singleton.serial;

import com.lx.learning.designpattern.singleton.hungry.HungrySingleton;

public class SingletonSerialTest {
    public static void main(String[] args) {
        HungrySingleton singleton = HungrySingleton.getInstance();
        byte[] bytes = SerialUtil.serial(singleton);
        HungrySingleton hungrySingleton1 = SerialUtil.deSerial(bytes);
        HungrySingleton hungrySingleton2 = SerialUtil.deSerial(bytes);
        System.out.println(hungrySingleton1 == hungrySingleton2);
    }
}
