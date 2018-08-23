package com.xdf;

import com.xdf.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.util.Assert;

import java.util.Date;

public class StudentTest {


    public static void main(String[] args) {
        ApplicationContext  context=new ClassPathXmlApplicationContext("applicationContext.xml");
       Student student= (Student) context.getBean("student2");
        System.out.println(student);

        //创建el表达式对象
        ExpressionParser  parser=  new SpelExpressionParser();
        Date date=new Date();
        int year = parser.parseExpression("year").getValue(date, int.class);
        System.out.println(year==date.getYear());

        int value =  parser.parseExpression("T(Integer).MAX_VALUE").getValue(int.class);
        System.out.println(value);
    }
}


/**
 * SpEL是spring3.0版本之后出现的功能
 *
 * 1. 支持 基本表达式
 *    字符串
 *        String value = parser.parseExpression("\"Hello  World\"").getValue(String.class);
 *    数值类型
 *      double value = parser.parseExpression("123").getValue(double.class);
 *    布尔值
 *   Boolean value = parser.parseExpression("FALSE").getValue(boolean.class);
 * 2.算术运算符
 *  int value =  parser.parseExpression("1+1+2*3").getValue(int.class);
 * 3.逻辑表达式
 *    and  or  ！
 * boolean value =  parser.parseExpression("1>2 and 2>1").getValue(boolean.class);
 *4.类相关的信息
 *  int value =  parser.parseExpression("T(Integer).MAX_VALUE").getValue(int.class);
 *
 */
