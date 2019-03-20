package com.lx.learning.designpattern.factory.common;

public class ParkingMessage implements Message {
    //停车标志位
    private int isParking;


    public int getIsParking() {
        return isParking;
    }

    public void setIsParking(int isParking) {
        this.isParking = isParking;
    }

    @Override
    public void decode(byte[] data) {
        this.isParking=data[0];
    }

    @Override
    public String toString() {
        return "ParkingMessage{" +
                "isParking=" + isParking +
                '}';
    }
}
