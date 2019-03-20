package com.lx.learning.designpattern.factory.abstractmethod;

public class AlkxFactory implements AbstractMethodFactory {
    @Override
    public IGarage createGarage() {
        return new Garage();
    }

    @Override
    public ILock createLock() {
        return new Lock();
    }

    @Override
    public IMag createMag() {
        return new Mag();
    }
}
