package com.lanxing.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSetDemo {
    public static void main(String[] args) {
        //HashSet并不能保证顺序
        Set<String> sets = new HashSet<>();
        //有些场景可能误导
        sets.add("a");
        sets.add("c");
        sets.add("b");
        sets.forEach(System.out::println);
        sets.forEach(e -> {
            System.out.println(e.hashCode());
        });
        sets.clear();
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("b");
        treeSet.forEach(e -> {
            System.out.println(e);
        });
        System.out.println(((TreeSet<String>) treeSet).lower("b"));
    }
}
