package com.lx.learning.blockingqueuetest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestArrayBlockingQueue {
    public static void main(String[] args) throws Exception {
        BlockingQueue blockingQueue=new ArrayBlockingQueue(2);
        //1.只能放入两个元素，超过的元素返回的是false
        System.out.println(blockingQueue.offer(1));
        System.out.println(blockingQueue.offer(2));
        System.out.println(blockingQueue.offer(3));
        //2.队列满了使用了put会阻塞
        blockingQueue.put(4);

    }
}
