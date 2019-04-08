package com.lx.learning.interviewquestions;

import java.io.IOException;

/**
 * Created by Administrator on 2019/4/7.
 */
public class ProcessDemo {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        try {
            runtime.exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
