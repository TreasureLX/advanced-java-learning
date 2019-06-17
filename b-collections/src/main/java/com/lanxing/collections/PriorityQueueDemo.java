package com.lanxing.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue queue=new PriorityQueue();
        queue.offer("a");
        queue.offer("c");
        queue.offer("b");
        queue.forEach(System.out::println);
    }
}
