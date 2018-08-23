package com.xdf.dao.impl;

import com.xdf.dao.StudentDao;

public class StudentDaoImpl  implements StudentDao{



    public StudentDaoImpl(){
        System.out.println("StudentDaoImpl=======实例化");
    }

    /**
     * 打招呼的方法
     */
    public void sayHello() {
        System.out.println("学生打招呼的方法");
    }

    /**
     * @return 吃饭方法
     */
    public String eat() {
        System.out.println("学生吃饭方法");
        return "apple";
    }
}
