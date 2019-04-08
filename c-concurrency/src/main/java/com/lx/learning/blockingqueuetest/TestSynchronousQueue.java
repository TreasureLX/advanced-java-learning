package com.lx.learning.blockingqueuetest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class TestSynchronousQueue {
    public static void main(String[] args) throws Exception {
        BlockingQueue blockingQueue=new SynchronousQueue();
        //1.offer的结果都为false
        System.out.println(blockingQueue.offer("1"));
        System.out.println(blockingQueue.offer("2"));
        //2.这里会阻塞
        System.out.println(blockingQueue.take());
        //3.put一个元素的时候会阻塞
        blockingQueue.put("1");
        System.out.println("Add one element");
        blockingQueue.put("2");
    }
}
