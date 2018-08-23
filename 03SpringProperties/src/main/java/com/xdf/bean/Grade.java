package com.xdf.bean;

/**
 * 年级的实体类
 */
public class Grade {

    private  int  gradeId;  //年级编号
    private  String  name;  // 年级名称


    public Grade() {
        System.out.println("grade=============无参构造");
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", name='" + name + '\'' +
                '}';
    }
}
