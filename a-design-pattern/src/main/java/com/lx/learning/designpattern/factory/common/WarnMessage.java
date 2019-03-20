package com.lx.learning.designpattern.factory.common;

public class WarnMessage implements Message {
    //电量报警
    private int battery;
    //温度报警
    private int temperature;


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void decode(byte[] data) {
        this.battery=data[0];
        this.temperature=data[1];
    }

    @Override
    public String toString() {
        return "WarnMessage{" +
                "battery=" + battery +
                ", temperature=" + temperature +
                '}';
    }
}
