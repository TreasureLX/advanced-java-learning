package com.lanxing.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class FailFastAndFailSafeDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        try {
            for (String str : list) {
                list.remove(str);
            }
        } catch (ConcurrentModificationException e) {
//            e.printStackTrace();
            System.out.println("FailFast异常");
        }
    }
}
