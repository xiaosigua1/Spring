package com.xdf.dao.proxy;

import com.xdf.dao.Animal;
import com.xdf.dao.impl.Dog;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 我们自身的动态代理类
 * 无论有多少个animal  都没有问题
 */
public class MyProxy  implements InvocationHandler{

    /**
     *  01.我们不确定委托类是谁？委托类的类型 是Object
     *   和委托类建立关联关系
     */
    private  Object target;


    /**
     * 02.给我一个委托类，我返回一个代理类对象
     */
    public  Object createProxy(Object target){
        this.target=target;  //你传递的是Cat  那么我们关联对象就是Cat
       return Proxy.newProxyInstance(target.getClass().getClassLoader(),
               target.getClass().getInterfaces(),this);
    }


    /**
     * 实现系统级业务和主业务之间的交互
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("主人在召唤"); //系统级业务   开始事务
        Object result= method.invoke(target,args);  // 主业务
        System.out.println("主人离开"); //系统级业务     日志处理  关闭事务
        return result;
    }


    //创建测试方法
    public static void main(String[] args) {
        MyProxy proxy=new MyProxy();
      Animal dog= (Animal) proxy.createProxy(new Dog());
      dog.eat();
      System.out.println("**************************");
      dog.sleep();




    }

}
