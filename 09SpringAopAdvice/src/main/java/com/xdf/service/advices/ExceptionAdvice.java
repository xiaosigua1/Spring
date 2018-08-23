package com.xdf.service.advices;

import com.xdf.service.exceptionPackage.AgeException;
import com.xdf.service.exceptionPackage.UserNameException;
import org.springframework.aop.ThrowsAdvice;

//异常通知
public class ExceptionAdvice implements ThrowsAdvice {


    /**
     * @param ex 用户名异常
     */
    public  void  afterThrowing(UserNameException ex){
        System.out.println(ex.getMessage());
    }
    /**
     * @param ex 年龄异常
     */
    public  void  afterThrowing(AgeException ex){
        System.out.println(ex.getMessage());
    }
}
