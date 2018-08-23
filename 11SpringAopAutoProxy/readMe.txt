现在解决的问题:

********01.配置多个目标对象，使用一个代理工厂！********
********02.我们getBean（）还是使用的代理！不符合我们的逻辑！应该是service********


<!--只需要在配置文件中   配置自动的代理生成器-->
<bean class="org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator"/>

就可以解决上面的两个问题




Bean后处理器！BeanPostProcessor
任何一个bean只要是实现了BeanPostProcessor接口或者实现类，就必须实现接口中的两个方法！

    //在beanClass的初始化对象之前执行的方法   beanId就是在容器中beanClass对应的id
       Object postProcessBeforeInitialization(Object beanClass, String beanId) throws BeansException;
    //在beanClass的初始化对象之后执行的方法   beanId就是在容器中beanClass对应的id
       Object postProcessAfterInitialization(Object beanClass, String beanId) throws BeansException;



执行了============》无参构造
执行了============》setName
postProcessBeforeInitialization之前======>dog
执行了============》 afterPropertiesSet
执行了============》 init
postProcessBeforeInitialization之后======>dog
执行了============》 destory