package com.lx.learning.designpattern.factory.factorymethod;

import com.lx.learning.designpattern.factory.common.Message;
import com.lx.learning.designpattern.factory.common.ParkingMessage;

public class ParkingMessageFactory implements Factory {
    @Override
    public Message createMessage() {
        return new ParkingMessage();
    }
}
