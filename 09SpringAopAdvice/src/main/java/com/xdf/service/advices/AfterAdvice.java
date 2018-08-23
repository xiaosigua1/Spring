package com.xdf.service.advices;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//后置通知
public class AfterAdvice implements AfterReturningAdvice {
    /**
     * 在目标方法执行之后
     * @param returnValue   目标方法的返回值     我们可以获取返回值 但是不能操作返回值
     * @param method   目标方法
     * @param args    目标方法的参数列表
     * @param target    目标对象
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
     /*   System.out.println("target的名称====》"+target);
        System.out.println("returnValue====》"+returnValue);
        System.out.println("method的名称====》"+method.getName());*/
        System.out.println("执行**** 后置**** 通知");
    }
}
