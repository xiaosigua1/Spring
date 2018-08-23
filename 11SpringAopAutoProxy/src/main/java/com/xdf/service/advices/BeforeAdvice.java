package com.xdf.service.advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//前置通知
public class BeforeAdvice implements MethodBeforeAdvice {
        /**
         * 在目标方法执行之前
         * @param method   目标方法
         * @param args    目标方法的参数列表
         * @param target    目标对象
         * @throws Throwable
         */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行**** 前置**** 通知");
    }
}
