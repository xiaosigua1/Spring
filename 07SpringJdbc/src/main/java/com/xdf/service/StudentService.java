package com.xdf.service;

import com.xdf.bean.Student;

import java.util.List;

public interface StudentService {
    int  addStudent(Student student);
    int  delStudent(Student student);
    int  updateStudent(Student student);
    List<Student> findAllStudents();
}
