package com.beckson.school.controller;

import com.beckson.school.pojo.Student;
import com.beckson.school.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/simple")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent() {

        return studentService.getAllStudent();

    }

    @GetMapping("/students/{studentId}")
    public Student getAllStudent(@PathVariable String studentId) {

        return studentService.getBySid(studentId);

    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student theStudent) {

        Student dbStudent = studentService.addStudent(theStudent);
//        studentService.addStudent(theStudent);
        return dbStudent;
    }


    @DeleteMapping("/students/test/{studentId}")
    public String deleteTestStudent(@PathVariable String studentId) {

        studentService.deleteTestStudent(studentId);
        return "已刪除測試資料學號 - " + studentId;
    };



}
