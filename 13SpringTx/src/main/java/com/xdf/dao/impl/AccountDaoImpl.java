package com.xdf.dao.impl;

import com.xdf.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport  implements AccountDao{
    /**
     * 注册用户
     *
     * @param aname   用户名
     * @param balance 余额
     */
    public void addAccount(String aname, double balance) {
        String sql="insert into account(aname,balance)  values(?,?)";
        this.getJdbcTemplate().update(sql,aname,balance);
    }

    /**
     * 谁花了多少钱
     *
     * @param aname 用户名
     * @param money 金额
     */
    public void updateAccount(String aname, double money) {
        String sql="update account  set balance=balance-? where aname=?";
        this.getJdbcTemplate().update(sql,money,aname);
    }
}
