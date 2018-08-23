package com.xdf.service.impl;

import com.xdf.bean.Student;
import com.xdf.dao.StudentDao;
import com.xdf.service.StudentService;

import java.util.List;

public class StudentServiceImpl  implements StudentService {

     private StudentDao dao;


    public int addStudent(Student student) {
        return dao.addStudent(student);
    }

    public int delStudent(Student student) {
        return dao.delStudent(student);
    }

    public int updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }
}
