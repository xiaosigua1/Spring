package com.xdf.dao.impl;

import com.xdf.dao.Animal;

public class Dog  implements Animal {


    public Dog(){
        System.out.println("小狗狗========构造函数");
    }

    /**
     * 睡觉
     */
    public void sleep() {
        System.out.println("小狗狗在睡觉");
    }

    /**
     * 吃饭
     */
    public String eat() {
        System.out.println("小狗狗在吃饭");
        return "apple";
    }


    /**
     * bean的生命始末
     */
    public  void  init(){
        System.out.println("dog类中的 =========== init()");
    }

    public  void  destroy(){
        System.out.println("dog类中的 =========== destroy()");
    }


}
