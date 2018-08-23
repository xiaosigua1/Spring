package com.xdf;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDemo {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext
                ("applicationContext.xml");

      //获取主人信息
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

}
