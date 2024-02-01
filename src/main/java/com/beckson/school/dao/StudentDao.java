package com.beckson.school.dao;

import com.beckson.school.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentDao {
    List<Student> getAllStudent();

    Student getBySid(@Param("sid") String sid);

    void addStudent(Student student);

    void deleteTestStudent(@Param("sid") String sid);

}
