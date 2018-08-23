回忆之前的知识点：
  一：事务的概念
           将一系列的数据操作捆绑在一起，成为一个整体进行统一管理！
           一条或者多条sql语句的集合！

  二：事务的ACID特性
       原子性（Atomicity）：在事务中的操作，要么都执行，要么都不执行！
       一致性（Consistency）：事务必须保证数据从一个一致性的状态到达另一个
                            一致性的状态！
       持久性(Durability)：事务一旦提交，对数据库的数据影响是永久性的！
       隔离性（Isolation）：每个事务之前互不干扰！

     事务创建的原则：
      1.事务尽可能简短
          因为启动事务之后，数据库管理系统需要保留大量资源来保证事务的ACID！
          如果是多用户的系统，那么会严重影响我们的系统性能！
      2.事务中访问的数据量要小
          在并发的情况下，执行事务，事务的访问量越小，各个线程之前对数据的
          争夺就越小！
      3.查询时尽量不使用事务
          因为查询不会修改数据！
      4.在事务处理过程中，尽量不要出现用户等待的情况
           如果登台事件过程，占用资源太久，有可能造成系统阻塞！



  三：Spring的事务管理

        注意点：
          01.本身事务是数据库中的概念，按理说应该放置在dao层！
          02.绝大多数清空下，我们把事务提升到service层！



  四：Spring的事务管理实现
       01.使用spring的事务工厂
       02.使用spring的注解
       03.使用AspectJ           *****

  五：必须掌握的事务中的两个属性

      1.Isolation:五种事务隔离级别

          01.default：采用数据库默认的事务隔离级别
               mysql：repeatable-read(可重复读取)
               oracle:read-committed(读提交)
          02.repeatable-read(可重复读取)：解决了脏读和不可重复读，但是有可能发生幻读（通过其他的锁机制解决）！
          03.read-committed(读提交)：解决了脏读,但是没解决不可重复读
          04.read-uncommitted(读未提交)：什么都没有解决！
          05.serializable（串行化）：解决并发的问题！

      2.Propagation:七种事务传播行为

           01.required：是spring默认的事务传播行为！
                        指定的方法必须在事务内执行，
                        如果没有事务，自动创建事务并执行！
           02.supports：有没有事务都执行！
                        有事务就在事务中执行，否则直接执行！
           03.mandatory：如果当前存在事务，就执行该事务，
                         如果当前不存在事务，就抛出异常。
           04.requires_new：总是创建新事务，
                          如果当前方法存在事务，则当前事务挂起，
                          直到新创建的事务执行完毕！
           05.not_supported：不能在事务中执行，
                            如果当前方法存在事务，则当前事务挂起！
           06.never：     不能在事务中执行，
                           如果当前方法存在事务，则抛出异常。
           07.nested：如果当前存在事务，则在嵌套事务内执行。
                      如果当前没有事务，则执行与requires_new类似的操作。


    requires_new 启动一个新的, 不依赖于环境的 "内部" 事务.
    这个事务将被完全 commited 或 rolled back 而不依赖于外部事务,
    它拥有自己的隔离范围, 自己的锁, 等等. 当内部事务开始执行时,
     外部事务将被挂起,内务事务结束时, 外部事务将继续执行.


     另一方面, nested 开始一个 "嵌套的" 事务,
     它是已经存在事务的一个真正的子事务. 潜套事务开始执行时,
      它将取得一个 savepoint. 如果这个嵌套事务失败,
      我们将回滚到此 savepoint. 潜套事务是外部事务的一部分,
      只有外部事务结束后它才会被提交.

    由此可见, requires_new 和 nested 的最大区别在于,
    requires_new 完全是一个新的事务,
    而 nested 则是外部事务的子事务,
    如果外部事务 commit, 潜套事务也会被 commit,
    这个规则同样适用于 roll back.

   3. timeout_default:事务等待时间！


 六：Spring的事务管理的接口PlatformTransactionManager
      常用的两个实现类
      01.使用jdbc或者mybatis ： 使用DataSourceTransactionManager
      02.使用hibernate：        使用HibernateTransactionManager

 七：Spring的事务回滚处理

    Spring的默认回滚方式：
        程序发生运行时异常（Runtime Exception）回滚！
        程序发生受查异常（Checked Exception）时提交！

      受查异常需要我们手动的设置回滚方式！
      一旦发生运行时异常，jvm终止操作！



   八：用户购买股票的案例

     1.引入数据库需要的素材

           USE `t13test`;

           DROP TABLE IF EXISTS `account`;
           CREATE TABLE `account` (
             `aid` int(10) NOT NULL AUTO_INCREMENT,
             `balance` double DEFAULT NULL,
             `aname` varchar(20) DEFAULT NULL,
             PRIMARY KEY (`aid`)
           ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
           insert  into `account`(`aid`,`balance`,`aname`) values (1,10000,'张三');

           DROP TABLE IF EXISTS `stock`;

           CREATE TABLE `stock` (
             `sid` int(10) NOT NULL AUTO_INCREMENT,
             `sname` varchar(20) DEFAULT NULL,
             `amount` int(10) DEFAULT NULL,
             PRIMARY KEY (`sid`)
           ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

           insert  into `stock`(`sid`,`sname`,`amount`) values (1,'张三',0);


  2.创建对应的java项目
     01.创建对应的包以及实体类
        Account
        Stock
     02.引入需要的spring核心配置文件
        在配置文件中的头部增加tx需要的模版
         xmlns:tx="http://www.springframework.org/schema/tx"
     03.创建dao层以及对应的代码
     04.创建daoImpl层以及对应的代码
         daoImpl层需要继承 JdbcDaoSupport
     05.创建service层以及对应的impl类
     06.在核心配置文件中 配置bean之间的关系
     07.书写测试类 运行 发现没有问题

     08.使用spring事务工厂来解决异常
          001.创建proxyfactory包
          002.赋值之前的service层代码
          003.在BuyStockServiceImpl中模拟异常
          004.创建测试方法啊 发现问题  钱减少 但是股票不加!  因为有异常

     09.在spring核心配置文件中增加事务
         一：使用事务工厂代理
         001.配置事务管理器===》数据源
         002.配置目标对象
         003.指定切入点以及异常回滚的异常类对象，事务隔离级别，事务传播行为
         004.注意点  在测试类中获取的不在是service层 ，直接获取代理对象











