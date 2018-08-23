package com.xdf.service.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect       //表示当前的类 是切面
public class MyAspectJ {

    //前置增强
    @Before("execution(* *..UserServiceImpl.eat(..))")
    public void before(){
        System.out.println("前置增强");
    }
    //前置增强
    @Before("execution(* *..UserServiceImpl.eat(..))")
    public void before(JoinPoint jp){
        System.out.println("前置增强==>"+jp);
    }
    //后置增强
    @AfterReturning("execution(* *..UserServiceImpl.eat(..))")
    public void afterReturning(){
        System.out.println("后置增强==>");
    }
    @AfterReturning(value = "execution(* *..UserServiceImpl.eat(..))",returning ="result" )
    public void afterReturning(String result){
        System.out.println("后置增强==>"+result);
    }


    //环绕增强 必须需要一个参数
    @Around("execution(* *..UserServiceImpl.eat(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强1==>");
        Object  result=null;
            result= pjp.proceed(); //执行目标方法
        System.out.println("环绕增强2==>");
        return  "小豆腐";
    }
    //异常增强
    @AfterThrowing("exeEat()")
    public void afterThrowing(){
        System.out.println("异常增强1==>");
    }
    @AfterThrowing(value="exeEat()",throwing = "ex")
    public void afterThrowingTwo(Exception ex){
        System.out.println("异常增强2==>"+ex);
    }

    //最终增强
    @After("exeEat()")
    public void after(){
        System.out.println("最终通知==>");
    }


    //定义切入点 优点类似于mybatis中的sql片段
    @Pointcut("execution(* *..UserServiceImpl.eat(..))")
    private  void  exeEat(){}  //别的切面无需获取

}
