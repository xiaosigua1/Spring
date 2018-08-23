package com.xdf.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
//bean后处理器
public class MyPostBeanProcessor implements BeanPostProcessor {
    //bean的实例化之前执行的方法
    public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
         System.out.println("postProcessBeforeInitialization之前======>"+id);
        return bean;
    }
    //bean的实例化之后执行的方法
    public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
        System.out.println("postProcessBeforeInitialization之后======>"+id);
        return bean;
    }
}
