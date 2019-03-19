package com.lx.learning.designpattern.prototype.simple;

public class PrototypeTest {
    public static void main(String[] args) {
        User user=new User();
        user.setUserName("lx");
        user.setAge(10);
        User user1= (User) new Client().getPrototype(user);
        System.out.println(user==user1);
        //Cloneable是浅克隆
        User jdk= (User) user.clone();
        System.out.println(jdk.getHobby() == user.getHobby());
    }
}
