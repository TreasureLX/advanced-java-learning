package com.lanxing.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List referencedValue = list;
        List checkedList = Collections.checkedList(referencedValue, String.class);
        checkedList.forEach(e -> {
            System.out.println(e);
        });
        checkedList.add(1);

        //检查数据类型是否有问题

//        list.forEach(e->{
//            System.out.println(e);
//        });

    }
}
