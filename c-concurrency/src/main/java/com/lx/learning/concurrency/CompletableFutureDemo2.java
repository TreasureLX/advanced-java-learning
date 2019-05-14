package com.lx.learning.concurrency;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author lanxing
 */
public class CompletableFutureDemo2 {
    private static final Random random=new Random();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        int value=random.nextInt(200);
        System.out.println("value==>"+value);
        Future<String> future = service.submit(() -> {
            System.out.println("before");
            Thread.sleep(value);
            System.out.println("after");
            return "hello";
        });
        try {
            System.out.println(future.get(100,TimeUnit.MILLISECONDS));
        } catch (TimeoutException e) {
            System.out.println("Time Out");
            //true表示剩下的代码也会执行
            //false表示剩下的代码不执行了
            future.cancel(false);
        }finally {
            service.shutdown();
        }

    }
}
