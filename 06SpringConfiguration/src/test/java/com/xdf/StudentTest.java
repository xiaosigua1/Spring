package com.xdf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {


    public static void main(String[] args) {
        /**
         * 加载的主配置文件
         *  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
         Student student= (Student) context.getBean("student");
         System.out.println(student);
         */
       /* ApplicationContext context=new ClassPathXmlApplicationContext("spring-*.xml");*/
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-student.xml","spring-grade.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }
}
