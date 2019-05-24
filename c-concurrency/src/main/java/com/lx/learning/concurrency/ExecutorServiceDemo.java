package com.lx.learning.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            while (true) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException ignored) {
                    // 忽略异常，阻止线程中断
                }
                System.out.println("Hello,World!");
            }
        });
        // 停顿 1 s
        Thread.sleep(1 * 1000L);
        // 无法关闭任务
        executorService.shutdownNow();
    }
}
