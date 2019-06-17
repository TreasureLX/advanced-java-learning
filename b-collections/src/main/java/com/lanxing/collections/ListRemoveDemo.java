package com.lanxing.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListRemoveDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("a","b","c"));

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            String str=iterator.next().toString();
            System.out.println(str);
            iterator.remove();
//            list.add("test");
        }

        for (String str: list) {
            if(str.equals("b") || str.equals("a") ){
                list.remove(str);
            }
            System.out.println(str);
        }
    }
}
