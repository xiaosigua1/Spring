package com.xdf.service.exceptionPackage;

public class UserServiceImpl implements ExceptionService {

    public boolean checkUser(String userName, int age) throws UserException {
        if (!"admin".equalsIgnoreCase(userName)){
            throw  new UserNameException("用户名错误");
        }
        if (age<20){
            throw  new AgeException("年龄错误");
        }
        return true;
    }
}
