package com.beckson.school.service.serviceImpl;

import com.beckson.school.dao.StudentDao;
import com.beckson.school.pojo.Student;
import com.beckson.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {

        List<Student> students = studentDao.getAllStudent();
//        Date cdate = switchDateFormatStr(students.get(0).getCreateDate());
//        System.out.println("cdate: " + formatDate(cdate));
        return students;
    }

    @Override
    public Student getBySid(String sid) {

        Student tempStudent = studentDao.getBySid(sid);
        if(tempStudent == null){
            throw new RuntimeException("查無此學號的學生 - " + sid);
        }
        return tempStudent;
    }


    @Override
    public Student addStudent(Student theStudent) {

        if(studentDao.getBySid(theStudent.getSid()) == null){
            theStudent.setId(0);
        }else{
            throw new RuntimeException("您輸入的學號已被使用過 - " + theStudent.getSid());
        }
        studentDao.addStudent(theStudent);
        studentDao.addStudent(theStudent);

        return studentDao.getBySid(theStudent.getSid());
    }

//    private static Date switchDateFormatStr(Date date) {
//
//        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy/MM/dd");
//        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
//
//        // 设置输入时区为 UTC
//        inputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//
//        // 设置输出时区为 UTC
//        outputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//
//        String dateString = outputFormat.format(date);
//
//        try {
//            Date newDate = inputFormat.parse(dateString);
//            String formattedDate = outputFormat.format(newDate);
//            System.out.println("newDate: " + formattedDate);
//            return newDate;
//        } catch (ParseException e) {
//            return null;
//        }
//    }
//
//    private static String formatDate(Date date) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//        return dateFormat.format(date);
//    }
}
