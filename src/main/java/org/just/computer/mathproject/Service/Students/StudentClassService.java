package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.Bean.UserClass;
import org.just.computer.mathproject.DAO.Student.ClassResp;
import org.just.computer.mathproject.DAO.Student.StudentClassResp;
import org.just.computer.mathproject.DAO.Student.TeacherResp;
import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.Entity.Students.Student;
import org.just.computer.mathproject.Entity.Students.StudentClass;
import org.just.computer.mathproject.Entity.Students.Teacher;
import org.just.computer.mathproject.Entity.Students._Class;
import org.just.computer.mathproject.Entity.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentClassService {
    @Autowired
    StudentClassResp studentClassResp;
    @Autowired
    UserDao userDao;
    @Autowired
    ClassResp classResp;
    @Autowired
    TeacherResp teacherResp;
    public List<StudentClass> getAllStudentClass() {
        return studentClassResp.findAll();
    }

    public void addStudentClass(Integer userid,Integer classid) {
        StudentClass studentClass=new StudentClass();
        studentClass.setUserid(userid);
        studentClass.setClassid(classid);
        studentClassResp.save(studentClass);
    }
    public void joinClassByClassId(Integer classid,String username) throws Exception{
        Integer userid = userDao.findUserByUsername(username).getId();
        List<StudentClass> list = studentClassResp.findAllByUseridEquals(userid);
        for(StudentClass sc: list){
            if(sc.getClassid()==classid){
                throw new Exception("加入失败");
            }
        }
        StudentClass studentClass = new StudentClass();
        studentClass.setClassid(classid);
        studentClass.setUserid(userid);
        studentClassResp.save(studentClass);
    }
    public void deleteStudentClassById(Integer id){
        studentClassResp.deleteById(id);
    }
    public List<UserClass> getUserClass(String username){
        //返回的班级
        List<UserClass> userClass = new ArrayList<>();
        //找到用户
        Integer userid = userDao.findUserByUsername(username).getId();
        //获取用户所有班级
        List<StudentClass> ll = studentClassResp.findAllByUseridEquals(userid);
        List<Integer> l = new ArrayList<>();
        //获取用户班级的id
        for(StudentClass sc : ll){
            UserClass userClass1 = new UserClass();
            userClass1.setClassid(sc.getClassid());
            userClass.add(userClass1);
            l.add(sc.getClassid());
        }
        //根据班级id查找所有班级
        List<_Class> classes = classResp.findAllById(l);
        for(int i=0;i<classes.size();i++){
            userClass.get(i).setClassName(classes.get(i).getClassname());
            userClass.get(i).setTeacherName(userDao.findUserByIdEquals(teacherResp.findByIdEquals(classes.get(i).getTeacherid()).getUserid()).getUsername());
            userClass.get(i).setManNums(studentClassResp.findAllByClassidEquals(classes.get(i).getId()).size());
        }
        return userClass;
    }
}
