package com.xdf.service.impl;

import com.xdf.dao.AccountDao;
import com.xdf.dao.StockDao;
import com.xdf.service.BuyStockService;

//业务逻辑层
public class BuyStockServiceImpl implements BuyStockService{

    //用户
    private AccountDao accountDao;
    //股票
    private StockDao stockDao;

    /**
     * 谁花了多少钱  自己的股票账户增加
     *
     * @param name   谁
     * @param money  多少钱
     * @param amount 股票数量
     */
    public void buyStock(String name, double money, int amount) {
        //用户减钱
        accountDao.updateAccount(name,money);
        //用户股票增加
        stockDao.updateStock(name,amount);
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
}
