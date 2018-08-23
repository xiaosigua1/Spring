package com.xdf;

import com.xdf.service.BuyStockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BuyStock {


    /**
    没有使用事务的处理

     */
    @Test
    public  void testBuyNoTx(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       BuyStockService service= (BuyStockService) context.getBean("buyStockService");
       service.buyStock("张三",100,1);

    }



}
