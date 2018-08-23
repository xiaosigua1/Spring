package com.xdf.bean;


import java.io.Serializable;

//股票类
public class Stock implements Serializable{
    private  int  sid;
    private  String  sname;//持股人
    private  int  amount;//持股数量

    public Stock(int sid, String sname, int amount) {
        this.sid = sid;
        this.sname = sname;
        this.amount = amount;
    }

    public Stock() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", amount=" + amount +
                '}';
    }
}
