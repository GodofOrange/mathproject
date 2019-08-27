package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.ClassResp;
import org.just.computer.mathproject.Entity.Students._Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    ClassResp classResp;

    public List<_Class> getAllClass() {
        return classResp.findAll();
    }

    public void addClass(Integer teacherid,String classname) {
        _Class _class=new _Class();
        _class.setTeacherid(teacherid);
        _class.setClassname(classname);
        classResp.save(_class);

    }

    public void deleteclassById(Integer id){
        classResp.deleteById(id);
    }
}
