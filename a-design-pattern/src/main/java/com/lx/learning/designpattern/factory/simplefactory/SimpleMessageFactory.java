package com.lx.learning.designpattern.factory.simplefactory;

import com.lx.learning.designpattern.factory.common.Message;

public class SimpleMessageFactory {

    public Message createMessage(Class clazz) {
        try {
            Message message= (Message) clazz.newInstance();
            return message;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
