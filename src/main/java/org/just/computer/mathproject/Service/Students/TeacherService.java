package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.TeacherResp;
import org.just.computer.mathproject.Entity.Students.Student;
import org.just.computer.mathproject.Entity.Students.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherResp teacherResp;

    public List<Teacher> getAllTeacher() {
        return teacherResp.findAll();
    }

    public void addTeacher(Integer userid,Integer vip) {
        Teacher teacher=new Teacher();
        teacher.setUserid(userid);
        teacher.setVip(vip);
        teacherResp.save(teacher);
    }

    public void deleteTeacherById(Integer id){
        teacherResp.deleteById(id);
    }
}
