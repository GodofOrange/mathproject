package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.StudentResp;
import org.just.computer.mathproject.Entity.Students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentResp studentResp;

    public List<Student> getAllStudent() {
        return studentResp.findAll();
    }

    public void addStudent(Integer userid,Integer vip) {
        Student student=new Student();
        student.setUserid(userid);
        student.setVip(vip);
        studentResp.save(student);
    }

    public void deleteStudentById(Integer id){
        studentResp.deleteById(id);
    }
}
