package com.xdf;

import com.xdf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {


 //针对于annotatin方法
    @Test
    public  void  testAnnotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service= (UserService) context.getBean("userService");
        System.out.println(service.eat());
        service.sleep();
    }

 //针对于xml方法
    @Test
    public  void  testXml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("finally.xml");
        UserService service= (UserService) context.getBean("userService");
        service.eat();
        service.sleep();
    }
}
