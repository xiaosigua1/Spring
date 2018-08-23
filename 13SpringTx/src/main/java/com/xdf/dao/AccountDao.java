package com.xdf.dao;
//账户类接口
public interface AccountDao {

    /**
     * 注册用户
     * @param aname  用户名
     * @param balance  余额
     */
    void  addAccount(String  aname,double balance);

    /**
     *  谁花了多少钱
     * @param aname 用户名
     * @param money  金额
     */
    void  updateAccount(String  aname,double money);



}
