package com.lx.learning.designpattern.prototype.simple;

public class Client {

    public Prototype getPrototype(Prototype prototype){
        return prototype.clone();
    }
}
