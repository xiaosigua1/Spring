package com.xdf.dao;
//股票类接口
public interface StockDao {

    /**
     * 注册股票用户
     * @param sname  用户名
     * @param amount  股票数量
     */
    void  addStock(String sname, int amount);

    /**
     *  谁的股票增加了多少
     * @param sname 用户名
     * @param amount  股票数量
     */
    void  updateStock(String sname, int amount);



}
