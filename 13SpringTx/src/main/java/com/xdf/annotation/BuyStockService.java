package com.xdf.annotation;

import com.xdf.annotation.impl.BuyStockException;

//购买股票的接口
public interface BuyStockService {

    /**
     * 谁花了多少钱  自己的股票账户增加
     * @param name  谁
     * @param money 多少钱
     * @param amount 股票数量
     */
     void  buyStock(String name, double money, int amount) throws BuyStockException;

}
