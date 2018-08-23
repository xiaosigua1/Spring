package com.xdf;

import com.xdf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {

    //前置  后置 通知测试
    @Test
    public    void   testBefore(){
        ApplicationContext context=new ClassPathXmlApplicationContext("regexp.xml");
        UserService service= (UserService) context.getBean("userProxy");
        service.eat();
        System.out.println("*************");
        service.sleep();
    }
}
