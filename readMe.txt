Spring （容器）    概述：

 01.Java EE开发者的春天
 02.主要目的是 降低业务逻辑层和其他层的耦合度  IOC
 03.spring容器是用来创建（new）和管理（对象之间的关系）程序中所有对象的实例
 04.非侵入式轻量级开源框架
      001. 侵入式需要我们显示的使用框架中的API才能实现某种功能！
           框架强行的将功能推送给我们！
      002.非侵入式不需要改变我们之前的编码！
           我们自愿从框架中获取想要的功能！
 05.一站式（full  stack）开发
        001. 我们先去A酒店吃饭
        002. B娱乐场所唱歌
        003. C场所足疗

        吃饭,唱歌,足疗这三个功能都在一个D商务会馆中实现！
        那么D商务会馆就是一条龙服务！ （一站式）
  06.spring的核心
      001.IOC (Inversin  Of Control)  控制反转
         之前我们在service层创建dao的实例对象！ 控制权在service!
         现在我们创建dao的实例对象任务交给spring容器，控制权在spring容器!
         这种控制权由我们程序本身交给spring容器的行为，我们称之为IOC(控制反转)!

         DI（Dependency  Injection）依赖注入
            之前service层的代码
            com.xdf.dao.StudentDao  dao=new StudentDaoImpl();
            现在
             com.xdf.dao.StudentDao  dao=null;
             public  void  setDao(com.xdf.dao.StudentDao  stuDao){
             this.dao=stuDao;
             }
             我们只需要在spring容器中配置StudentDao,
             stuDao就有值了，然后通过调用setDao（）给this.dao赋值

           spring容器给我们创建了对象的实例，然后通过setXxx(),
           把对象的实例给我们需要的地方，这个过程我们称之为DI(依赖注入);


      002.AOP  (Aspect Oriented Programming)面向切面编程    底层就是动态代理设计模式
          专业术语：

           01.切面(Aspect):就是系统级业务，对主业务进行增强！
           02.织入(Weaving):将系统级业务放进主业务的过程！
           03.连接点(JoinPoint):所有的主业务方法都是连接点！
           04.切入点(PointCut):切面（系统级业务方法）织入到主业务方法，这个方法就是切入点！
           05.目标对象（Target）:要被增强的对象！
               UserService   user=New UserServiceImpl();
               user就是目标对象！
           06.通知（Advice）：是切面的一种实现方式，定义了织入的时间！
           07.顾问(Advisor)：是切面的一种实现方式，定义了织入的时间，织入的位置！
                    通知是顾问的一个属性！顾问包含通知！






    07.spring框架中的核心设计模式
         01.工厂
         02.反射
         03.单例
         04.代理
         05.适配器







