package com.lx.learning.interviewquestions;

/**
 * Created by Administrator on 2019/4/7.
 */
public class ShutdownHookQuestions {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new Thread(() -> {
            System.out.println("test");
        }));
    }
}
