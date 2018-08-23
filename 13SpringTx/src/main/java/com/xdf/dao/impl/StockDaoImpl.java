package com.xdf.dao.impl;

import com.xdf.dao.StockDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport  implements StockDao{
    /**
     * 注册股票用户
     *
     * @param sname  用户名
     * @param amount 股票数量
     */
    public void addStock(String sname, int amount) {
        String sql="insert into stock(sname,amount)  values(?,?)";
        this.getJdbcTemplate().update(sql,sname,amount);
    }

    /**
     * 谁的股票增加了多少
     *
     * @param sname  用户名
     * @param amount 股票数量
     */
    public void updateStock(String sname, int amount) {
        String sql="update stock  set amount=amount+? where sname=?";
        this.getJdbcTemplate().update(sql,amount,sname);
    }
}
