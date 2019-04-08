package com.lx.learning.interviewquestions;

/**
 * Created by Administrator on 2019/4/7.
 */
public class ThreadExecuteQuestions {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            System.out.println(thread.getName()+throwable.getMessage());
        });

        Thread thread=new Thread(()->{
            throw new RuntimeException("遇到异常");
        });
        thread.setDaemon(true);
        thread.start();
    }
}
