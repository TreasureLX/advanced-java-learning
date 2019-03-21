package com.lx.learning.test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{-4,-2,-1,5,8,11};
        System.out.println(Arrays.stream(a).map( x -> x*x ).sorted().toArray()[0]);
    }
}
