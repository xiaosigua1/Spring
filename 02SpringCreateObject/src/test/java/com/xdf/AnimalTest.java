package com.xdf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {


    public static void main(String[] args) {
        /**
         *01.根据我们的xml文件位置，找到xml文件，把找到的xml文件加载到内存中
         *02.根据xml文件中配置的各种bean,进行实例化
         */
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");


        /**
         * 如果想看到destroy的效果 必须手动的关闭容器
         */
        ((ClassPathXmlApplicationContext)context).close();

    }
}
