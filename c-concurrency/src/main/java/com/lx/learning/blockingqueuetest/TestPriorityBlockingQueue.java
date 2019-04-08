package com.lx.learning.blockingqueuetest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TestPriorityBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue=new PriorityBlockingQueue(2);
        //1.在offer的时候PriorityBlockingQueue会进行扩容，并且会自动排序
        blockingQueue.offer(5);
        blockingQueue.offer(56);
        blockingQueue.offer(10);
        System.out.println(blockingQueue.size());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue);

    }
}
