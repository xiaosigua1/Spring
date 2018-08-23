package com.xdf.service;

import org.springframework.beans.factory.InitializingBean;

//验证bean后处理器
public class Dog  implements InitializingBean {

    private  String  name;

    public Dog() {
        System.out.println("执行了============》无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("执行了============》setName");
        this.name = name;
    }

    public void  init(){
        System.out.println("执行了============》 init");
    }
    public void  destroy(){
        System.out.println("执行了============》 destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("执行了============》 afterPropertiesSet");
    }

    public  void  haha(){
        System.out.println("dog在Haha");
    }

}
