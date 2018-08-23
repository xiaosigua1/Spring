package com.xdf;

import com.xdf.service.Dog;
import com.xdf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {

        //前置  后置 通知测试
        @Test
        public    void   testBefore(){
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            UserService service= (UserService) context.getBean("userService1");
            service.eat();
            System.out.println("*************");
            service.sleep();

            UserService service2= (UserService) context.getBean("userService2");
            service2.eat();
            System.out.println("*************");
            service2.sleep();
        }

        //bean后处理器的测试
        @Test
        public    void   testBeanPost(){
            ApplicationContext context=new ClassPathXmlApplicationContext("beanPostProcessor.xml");
            Dog dog= (Dog) context.getBean("dog");

        }
        //beanName自动代理生成器
        @Test
        public    void   testBeanNameAuto(){
            ApplicationContext context=new ClassPathXmlApplicationContext("beanName.xml");
            UserService service= (UserService) context.getBean("userService");
            service.eat();
            service.sleep();
            System.out.println("***********************************");
            Dog dog= (Dog) context.getBean("dog");
            dog.haha();
        }
    }

