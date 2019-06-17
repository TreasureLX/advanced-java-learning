package com.lanxing.collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String,Object> data=new IdentityHashMap<>();
        System.out.println(System.identityHashCode("a"));
        System.out.println("a".hashCode());
        System.out.println(System.identityHashCode("a"));

        System.out.println("a".hashCode());
        System.out.println(new String("a").hashCode());
    }
}
