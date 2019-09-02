package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.ClassResp;
import org.just.computer.mathproject.DAO.Student.TeacherResp;
import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.Entity.Students.Teacher;
import org.just.computer.mathproject.Entity.Students._Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    ClassResp classResp;
    @Autowired
    TeacherResp teacherResp;
    @Autowired
    UserDao userDao;
    public List<_Class> getAllClass() {
        return classResp.findAll();
    }

    public void addClass(String username,String classname) {
        _Class _class=new _Class();
        _class.setTeacherid(teacherResp.findByUseridEquals(userDao.findUserByUsername(username).getId()).getId());
        _class.setClassname(classname);
        classResp.save(_class);
    }
    public void deleteclassById(Integer id){
        classResp.deleteById(id);
    }
    public List<_Class> getAllMyClass(String username){
        Integer uid = userDao.findUserByUsername(username).getId();
        Integer tid = teacherResp.findByUseridEquals(uid).getId();
        return classResp.findAllByTeacheridEquals(tid);
    }
}
