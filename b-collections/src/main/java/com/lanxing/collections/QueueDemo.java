package com.lanxing.collections;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        List<String> list = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();
        queue.offer("a");

        queue.forEach(e -> {
            System.out.println(e);
        });
    }
}
