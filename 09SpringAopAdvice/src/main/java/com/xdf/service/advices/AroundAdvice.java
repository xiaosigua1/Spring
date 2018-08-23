package com.xdf.service.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//环绕通知
public class AroundAdvice implements MethodInterceptor {

    /**
     * 在前置通知 之后，后置通知之前执行环绕通知！
     * 可以获取方法的返回值，并且改变！
     * @param methodInvocation 方法的执行器， getMethod 包含了方法中的所有方法
     * @return
     */
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("执行方法之前的  环绕通知");
        //执行目标方法
       Object result= methodInvocation.proceed();
       if (result!=null){
           result="xiaoheihei";
       }
        System.out.println("执行方法之后的  环绕通知");
        return result;
    }
}
