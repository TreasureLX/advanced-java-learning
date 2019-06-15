package com.lanxing.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("a","tttt");
        map.put("b","eeee");

        Set<Map.Entry<String,Object>> entries=map.entrySet();
        for (Map.Entry<String,Object> entry:entries) {
            System.out.println(entry.getKey());
        }
        HashSet<String> strings=new HashSet<>();
        TreeSet<String> treeSet=new TreeSet<>();

        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("d");

        System.out.println(treeSet.tailSet("b"));

        TreeMap treeMap=new TreeMap();
        treeMap.put("1","hhh");
        treeMap.put("2","rrrr");
        treeMap.put("3","rttyy");
        treeMap.put("4","dfgrt");
        treeMap.put("9","rere");

        System.out.println(treeMap.tailMap("5"));

    }
}
