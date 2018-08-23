package com.xdf.bean;

import java.util.*;

/**
 * spring  获取并给各种类型的属性赋值
 */
public class PropertiesBean {

     private String   name;
     private int   age;
     private  Student  student;
     private List<String> list=new ArrayList<String>();
     private Set<String> set=new HashSet<String>();
     private Map  map=new HashMap();
     private Properties properties=new Properties();
      private   String[] names=new String[5];

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
