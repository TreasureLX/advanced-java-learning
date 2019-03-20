package com.lx.learning.designpattern.factory.abstractmethod;

public interface AbstractMethodFactory {
    IGarage createGarage();
    ILock createLock();
    IMag createMag();
}
