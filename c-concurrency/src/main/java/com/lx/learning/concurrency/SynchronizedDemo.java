package com.lx.learning.concurrency;

public class SynchronizedDemo {
    public static void main(String[] args) {
        synchronized(SynchronizedDemo.class){

        }
    }

    private static void changeValue(int value){
        Data data=new Data();
        data.setValue(value);
    }

    private static class Data{
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
