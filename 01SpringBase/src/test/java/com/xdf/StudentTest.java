package com.xdf;

import com.xdf.dao.impl.Student;
import com.xdf.service.StudentService;
import com.xdf.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class StudentTest {

    /**
     * 之前耦合的方式
     */
    @Test
    public   void  studentTest(){
        StudentService service=new StudentServiceImpl();
        service.sayHello();
      }

    /**
     *通过spring容器的方式 创建对象
     *01.读取spring核心配置文件
     *02.通过核心配置文件找到指定id对应的bean
     *
     * ClassPathXmlApplicationContext
     * 01.applicationContext.xml 必须放在源文件夹中
     * 02.applicationContext.xml 中所有的bean都会在读取xml文件时，全部实例化
     */
    @Test
    public   void  studentTest2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("*******************************************");
        StudentService service = (StudentService) context.getBean("studentServiceImpl");
        service.sayHello();
    }

    /**
     *  把applicationContext.xml 文件放在电脑中的某个盘符下
     */
    @Test
    public   void  studentTest3(){
        ApplicationContext context=new FileSystemXmlApplicationContext("e:/applicationContext.xml");
        System.out.println("*******************************************");
        StudentService service = (StudentService) context.getBean("studentServiceImpl");
        service.sayHello();
    }
    /**
     *  01.不让applicationContext.xml 文件中的bean都加载
     *  02.按需加载
     */
    @Test
    public   void  studentTest4(){
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        System.out.println("*******************************************");
        Student student= (Student) factory.getBean("student");
        System.out.println(student);

    }


    /**
     * 验证单例模式
     *01.默认是单例
     * 02.之后再xml文件中的student2  增加属性scope="prototype"
     * 03.再次验证  两个对象肯定不一致
     */
    @Test
    public   void  studentTest5(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("*******************************************");
        Student student = (Student) context.getBean("student2");
        System.out.println(student);
        Student  student2 = (Student) context.getBean("student2");  //再次获取
        System.out.println(student==student2);

    }
}
