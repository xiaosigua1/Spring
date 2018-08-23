package com.xdf.bean;

/**
 * 学生的实体类
 */
public class Student {


    private   String  name;  //学生名称
    private   int  age;  //学生名称


    public Student() {
        System.out.println("student=============无参构造");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
