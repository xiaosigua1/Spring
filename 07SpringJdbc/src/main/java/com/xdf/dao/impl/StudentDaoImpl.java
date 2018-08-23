package com.xdf.dao.impl;

import com.xdf.bean.Student;
import com.xdf.dao.StudentDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Spring 有一个类叫 JdbcDaoSupport  ===>BaseDao
 * JdbcDaoSupport有一个属性叫JdbcTemplate
 * 在创建JdbcTemplate的时候 需要一个DataSource
 *
 * 我们只需要在配置文件中 配置数据源 即可！
 *
 */
public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {



    public int addStudent(Student student) {
       String sql="insert into student(sname,age) values(?,?)" ;
        return getJdbcTemplate().update(sql,student.getSname(),student.getAge());
    }

    public int delStudent(Student student) {
        String sql="delete from  student where sid=?" ;
        return  getJdbcTemplate().update(sql,student.getSid());
    }

    public int updateStudent(Student student) {
        String sql="update student set sname=?,and age=? where sid=?" ;
        return  getJdbcTemplate().update(sql,student.getSname(),student.getAge(),student.getSid());
    }

    /**
     * @return   行映射器  rowMapper
     */
    public List<Student> findAllStudents() {
        String  sql="select * from student";
        return  getJdbcTemplate().query(sql,new StudentRowMapper());
    }
}
