package com.xdf;

import com.xdf.bean.Student;
import com.xdf.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringJdbcDemo {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService service= (StudentService) context.getBean("studentServiceImpl");
        //service.addStudent(new Student("小白白3",50));
        List<Student>  students=service.findAllStudents();
        System.out.println(students);
    }
}
