package com.xdf;

import com.xdf.dao.Animal;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {

    @Test
    public   void  testStaticProxy(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        /**
         * 因为代理类AnimalProxy和Dog都有共同的接口 都是 Animal
         */
        Animal dog= (Animal) context.getBean("dogProxy");
        dog.eat();
        System.out.println("********************");
        dog.sleep();
    }
}
