package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.HomeworkStudentResp;
import org.just.computer.mathproject.Entity.Students.Homework;
import org.just.computer.mathproject.Entity.Students.HomeworkStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HomeworkStudentService {
    @Autowired
    HomeworkStudentResp homeworkStudentResp;

    public List<HomeworkStudent> getAllHomeworkStudent() {
        return homeworkStudentResp.findAll();
    }

    public void addHomeworkStudent(Integer homeworkid,Integer studentid,Integer score,Integer enabled,Integer peoplenumber) {
        HomeworkStudent homeworkStudent=new HomeworkStudent();
        homeworkStudent.setHomeworkid(homeworkid);
        homeworkStudent.setStudentid(studentid);
        homeworkStudent.setScore(score);
        homeworkStudent.setEnabled(enabled);
        homeworkStudent.setPeoplenumber(peoplenumber);
        homeworkStudentResp.save(homeworkStudent);
    }

    public void deleteHomeworkStudentById(Integer id){
        homeworkStudentResp.deleteById(id);
    }

}
