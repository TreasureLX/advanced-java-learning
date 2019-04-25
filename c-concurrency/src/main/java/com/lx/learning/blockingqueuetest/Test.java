package com.lx.learning.blockingqueuetest;

public class Test {

    private static Test test = new Test();

    static {
        System.out.println("B");
    }
    //这里的语句通过编译会放到构造器中所有代码的前面
    {
        System.out.println("A");
    }

    public static void main(String[] args) {
        Test test = new Test();
    }

    public Test() {
        System.out.println("C");
    }
}
