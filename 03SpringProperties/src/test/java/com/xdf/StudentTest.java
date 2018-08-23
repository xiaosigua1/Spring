package com.xdf;

import com.xdf.bean.Grade;
import com.xdf.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext
                ("applicationContext.xml");
        //获取指定的年级
       Grade grade= (Grade) context.getBean("grade");
        System.out.println(grade);
        //获取指定的学生
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }

}
