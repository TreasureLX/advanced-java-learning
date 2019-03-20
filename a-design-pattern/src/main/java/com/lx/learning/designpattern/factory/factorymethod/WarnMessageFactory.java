package com.lx.learning.designpattern.factory.factorymethod;

import com.lx.learning.designpattern.factory.common.Message;
import com.lx.learning.designpattern.factory.common.WarnMessage;

public class WarnMessageFactory implements Factory {

    @Override
    public Message createMessage() {
        return new WarnMessage();
    }
}
