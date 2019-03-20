package com.lx.learning.designpattern.factory.simplefactory;

import com.lx.learning.designpattern.factory.common.Message;
import com.lx.learning.designpattern.factory.common.ParkingMessage;
import com.lx.learning.designpattern.factory.common.WarnMessage;

import java.util.HashMap;
import java.util.Map;

public class Test {

    private static final Map<String,Class> messages=new HashMap<>();
    static {
        messages.put("0",ParkingMessage.class);
        messages.put("1",WarnMessage.class);
    }

    public static void main(String[] args) {
        byte[] data=new byte[]{1,1,2,3};
        SimpleMessageFactory factory=new SimpleMessageFactory();
        Message warnMessage=factory.createMessage(messages.get(String.valueOf(data[0])));
        warnMessage.decode(data);
        System.out.println(warnMessage.toString());
    }
}
