package com.xdf.dao.impl;

import com.xdf.dao.Animal;

public class Dog implements Animal {

    //主业务
    public void sleep() {
        System.out.println("小狗狗在睡觉");
    }

    //主业务
    public void eat() {
        System.out.println("小狗狗在啃骨头");
    }
}
