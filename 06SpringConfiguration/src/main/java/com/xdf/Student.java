package com.xdf;

/**
 * 学生的实体类
 */
public class Student {


    private   String  name;  //学生名称
    private   int  age;  //学生名称
    private   Grade grade;  //所属年级


    public Student() {
        System.out.println("student=============无参构造");
    }

    /**
     * 01：参数下标从 0 开始  name就是0
     *
     */
    public Student(String name, int age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
