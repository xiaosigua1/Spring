对于AOP思想，实现者有很多，Spring只是其中一个！有一个更牛的AOP框架
叫======================AspectJ！
Spring将AspectJ框架又引入到了自己的框架中！

我们在使用spring的时候，aop肯定使用，那就使用AspectJ！
AspectJ的使用需要引入两个jar包！
aspectj.weaver.jar
spring-aspects.jar

AspectJ中常用的五种通知
01.前置通知
02.后置通知
03.环绕通知
04.异常通知
05.最终通知


********  必须掌握的  AspectJ的切入点表达式  ********
切入点表达式语法：
execution
(
[访问权限类型]
返回值类型
[完整限定类名]
方法名(参数)
[抛出的异常类型]
)
切入点表达式常用的字符：

*：0-N个字符

..:  01.如果是在方法参数中，表示任意多个参数可以没有
     02.如果是在包后面，表示当前包以及子包

+：  01.如果是在类后面 ，表示当前类以及子类
     02.如果是在接口后面，表示当前接口以及实现类

例子：
execution(*  set*(..)) :所有以set开头的方法
execution(* com.xdf.service.*.*(..)) :com.xdf.service包下面所有类的所有方法
execution(* com.xdf.service..*.*(..)) :com.xdf.service包以及子包下面所有类的所有方法

常用的几个  务必掌握

execution(* *.service.*.*(..)): 一级包下面service子包中所有类的所有方法
    com.service    xdf.service 能匹配
    com.xdf.service   不能匹配

execution(* *..service.*.*(..)): 所有包下面service子包中所有类的所有方法
     com.xdf.service   能匹配

execution(* *.ServiceImpl.*(..)): 一级包下面 ServiceImpl接口或者类下面的所有方法
com.ServiceImpl
cn.ServiceImpl
xdf.ServiceImpl    com  cn  xdf 都是一级包名

execution(* *..ServiceImpl.*(..)): 所以包下面 ServiceImpl接口或者类下面的所有方法



execution(* add(String,int)):匹配所有包下所有类中add(String,int)

execution(* add(java.util.List)):匹配所有包下所有类中add(List)


如果我们想限定参数类型！
注意点： 所有java.lang包下面所有的类，不需要加完整限定名
         其他包中的类，务必加完整限定名


