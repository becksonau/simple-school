package com.beckson.school.dao;

import com.beckson.school.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentDao {
    List<Student> getAllStudent();

    Student getBySid(String sid);

    void addStudent(Student student);
}
