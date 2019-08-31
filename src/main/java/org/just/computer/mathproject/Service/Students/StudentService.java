package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.StudentResp;
import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.Entity.Students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentResp studentResp;
    @Autowired
    UserDao userDao;
    public List<Student> getAllStudent() {
        return studentResp.findAll();
    }

    public void addStudent(String username) {
        Student student=new Student();
        student.setUserid(userDao.findUserByUsername(username).getId());
        student.setVip(0);
        studentResp.save(student);
    }
    public void toBeVip(String username){
        Integer uid = userDao.findUserByUsername(username).getId();
        Student student = new Student();
        student.setId(studentResp.findByUseridEquals(uid).getId());
        student.setUserid(uid);
        student.setVip(1);
        studentResp.save(student);
    }
    public void deleteStudentById(Integer id){
        studentResp.deleteById(id);
    }
}
