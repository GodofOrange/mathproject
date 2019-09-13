package org.just.computer.mathproject.Service.Homework;

import org.just.computer.mathproject.DAO.Homework.Zuoye3Resp;
import org.just.computer.mathproject.Entity.Homework.Zuoye3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zuoye3Service {
    @Autowired
    Zuoye3Resp zuoye3Resp;

    public List<Zuoye3> getAllZuoye3() {
        return zuoye3Resp.findAll();
    }

    public void addZuoye3(String diy,Integer classifyid) {
        Zuoye3 zuoye3=new Zuoye3();
        zuoye3.setDiy(diy);
        zuoye3.setClassifyid(classifyid);
        zuoye3Resp.save(zuoye3);

    }

    public void deleteZuoye3ById(Integer id){
        zuoye3Resp.deleteById(id);
    }
}
