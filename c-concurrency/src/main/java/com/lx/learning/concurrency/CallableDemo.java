package com.lx.learning.concurrency;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        Callable callable=new MyCallable();
        ExecutorService executorService= Executors.newFixedThreadPool(100);
        Future<String> future=executorService.submit(callable);
        try {
            String test=future.get();
            System.out.println(test);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        return "hello";
    }
}
