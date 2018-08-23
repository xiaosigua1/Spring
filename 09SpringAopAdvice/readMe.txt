Spring原生的经典模式 实现 AOP
通知：
    前置通知：在目标方法执行之前执行，不能改变方法的执行流程和结果！
             实现 MethodBeforeAdvice接口！
    后置通知：在目标方法执行之后执行，不能改变方法的执行流程和结果！
             实现 AfterReturningAdvice接口！
    环绕通知：方法的拦截器！可以改变方法的执行流程和结果！
              实现 MethodInterceptor接口！
    异常通知：当我们的目标方法出现异常时才执行的方法！
              实现ThrowsAdvice接口！



实现各种增强（通知 advice）的步骤：

01.引入两个jar  一个是aop联盟  spring-aop
02.创建对应的接口和实现类(主业务)
03.创建对应的增强处理类（系统级业务）
04.在spring容器中配置 目标类对象和通知对象
05.配置ProxyFactoryBean(代理工厂类）

问题：
   01.如果我们有多个serviceImpl！ 这时候ProxyFactoryBean不能配置多个目标对象！
   02.ProxyFactoryBean给目标对象中的所有主业务都做了增强！不能指定某个主业务！


