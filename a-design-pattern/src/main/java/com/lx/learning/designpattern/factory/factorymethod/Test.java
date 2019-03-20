package com.lx.learning.designpattern.factory.factorymethod;

import com.lx.learning.designpattern.factory.common.Message;

public class Test {
    public static void main(String[] args) {
        ParkingMessageFactory factory=new ParkingMessageFactory();
        Message message=factory.createMessage();
        System.out.println(message);
    }
}
