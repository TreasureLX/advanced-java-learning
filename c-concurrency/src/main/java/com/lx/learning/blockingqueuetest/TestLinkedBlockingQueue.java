package com.lx.learning.blockingqueuetest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestLinkedBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue=new LinkedBlockingQueue();
        System.out.println(blockingQueue.offer(1));
        System.out.println(blockingQueue.offer(2));
        System.out.println(blockingQueue.offer(3));
        //2.队列满了使用了put会阻塞
        blockingQueue.put(4);
    }
}
