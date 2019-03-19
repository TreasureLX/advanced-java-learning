package com.lx.learning.designpattern.prototype.simple;

import java.util.List;

public class User implements Prototype,Cloneable {

    private String userName;
    private int age;
    private List hobby;

    @Override
    public Prototype clone() {
        User user=new User();
        user.setUserName(userName);
        user.setAge(age);
        user.setHobby(hobby);
        return user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }
}
