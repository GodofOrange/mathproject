package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.TeacherResp;
import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.Entity.Students.Student;
import org.just.computer.mathproject.Entity.Students.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherResp teacherResp;
    @Autowired
    UserDao userDao;
    public List<Teacher> getAllTeacher() {
        return teacherResp.findAll();
    }

    public void addTeacher(String username) {
        Teacher teacher=new Teacher();
        teacher.setUserid(userDao.findUserByUsername(username).getId());
        teacher.setVip(0);
        teacherResp.save(teacher);
    }
    public void toBeVip(String username){
        Integer uid = userDao.findUserByUsername(username).getId();
        Teacher teacher = new Teacher();
        teacher.setId(teacherResp.findByUseridEquals(uid).getId());
        teacher.setUserid(uid);
        teacher.setVip(1);
        teacherResp.save(teacher);
    }
    public void deleteTeacherById(Integer id){
        teacherResp.deleteById(id);
    }
}
