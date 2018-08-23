package com.xdf.dao;

import com.xdf.bean.Student;

import java.util.List;

public interface StudentDao {

    int  addStudent(Student student);
    int  delStudent(Student student);
    int  updateStudent(Student student);
    List<Student> findAllStudents();
}
