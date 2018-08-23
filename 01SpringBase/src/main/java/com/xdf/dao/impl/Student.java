package com.xdf.dao.impl;

/**
 * student实体类
 */
public class Student {

    private  int age;
    private String  name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
        System.out.println("student=====实例化");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
