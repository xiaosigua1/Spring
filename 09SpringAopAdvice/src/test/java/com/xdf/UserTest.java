package com.xdf;

import com.xdf.service.UserService;
import com.xdf.service.exceptionPackage.ExceptionService;
import com.xdf.service.exceptionPackage.UserException;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {


    //前置  后置 通知测试
    @Test
    public    void   testBefore(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service= (UserService) context.getBean("userProxy");
        service.eat();
        System.out.println("*************");
        service.sleep();
    }
    //环绕 通知测试
    @Test
    public    void   testAround(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service= (UserService) context.getBean("userProxy");
        String result= service.eat();
        System.out.println(result);
        System.out.println("*************");
        service.sleep();
    }
    //异常通知测试
    @Test
    public    void   testException(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ExceptionService service= (ExceptionService) context.getBean("userProxy");
        try {
            service.checkUser("admin",25);
        } catch (UserException e) {
            e.printStackTrace();
        }

    }
}
