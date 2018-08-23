package com.xdf.dao.impl;

import com.xdf.bean.Student;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student>{

    /**
     *
     * @param resultSet   之前叫 返回数据的结果集，是所有数据
     *                    现在 这个不是所有，是一行数据的结果集
     */
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student  student=new Student();
        student.setSid(resultSet.getInt("sid"));
        student.setSname(resultSet.getString("sname"));
        student.setAge(resultSet.getInt("age"));
        return student;
    }
}
