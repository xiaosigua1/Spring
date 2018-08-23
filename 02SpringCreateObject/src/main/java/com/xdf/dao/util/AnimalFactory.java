package com.xdf.dao.util;

import com.xdf.dao.Animal;
import com.xdf.dao.impl.Dog;

/**
 * 工厂类
 */
public class AnimalFactory {



    public  AnimalFactory(){
        System.out.println("静态工厂类===============构造");
    }

    public static Animal getDog(){
        System.out.println("==============静态工厂中创建了小狗狗的实例==============");
        return  new Dog();
    }
    public  Animal getDog2(){
        System.out.println("==============动态工厂中创建了小狗狗的实例==============");
        return  new Dog();
    }

}
