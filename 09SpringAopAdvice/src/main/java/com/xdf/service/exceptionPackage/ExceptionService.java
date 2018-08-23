package com.xdf.service.exceptionPackage;

//验证异常通知的接口
public interface ExceptionService {

    public  boolean  checkUser(String  userName,int age) throws UserException;
}
