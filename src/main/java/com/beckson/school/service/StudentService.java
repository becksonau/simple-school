package com.beckson.school.service;

import com.beckson.school.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    Student getBySid(String sid);

    Student addStudent(Student student);

    void deleteTestStudent(String studentId);
}
