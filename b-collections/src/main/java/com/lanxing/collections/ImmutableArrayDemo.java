package com.lanxing.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lanxing
 */
public class ImmutableArrayDemo {
    public static void main(String[] args) {
        //singletonList的使用，只包含一个元素
        //List<String> list= Collections.singletonList("1");
        ImmutableArrayDemo demo = new ImmutableArrayDemo();
        ImmutableArrayDemo[] demos = {demo};
        //说明Arrays.copyOf为浅拷贝
        ImmutableArrayDemo[] copy = Arrays.copyOf(demos, demos.length);
        System.out.println(demos[0] == demos[0]);

        copy[0] = new ImmutableArrayDemo();
        System.out.println(demos[0] == demos[0]);

        //尽量用Iterable声明集合
        //少用ArrayList多用LinkedList
        Iterable iterable=new ArrayList();

    }
}
