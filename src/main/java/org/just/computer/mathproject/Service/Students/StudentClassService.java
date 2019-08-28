package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.StudentClassResp;
import org.just.computer.mathproject.Entity.Students.StudentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentClassService {
    @Autowired
    StudentClassResp studentClassResp;

    public List<StudentClass> getAllStudentClass() {
        return studentClassResp.findAll();
    }

    public void addStudentClass(Integer userid,Integer classid) {
        StudentClass studentClass=new StudentClass();
        studentClass.setUserid(userid);
        studentClass.setClassid(classid);
        studentClassResp.save(studentClass);
    }

    public void deleteStudentClassById(Integer id){
        studentClassResp.deleteById(id);
    }
}
