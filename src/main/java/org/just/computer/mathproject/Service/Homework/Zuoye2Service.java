package org.just.computer.mathproject.Service.Homework;

import org.just.computer.mathproject.DAO.Homework.Zuoye2Resp;
import org.just.computer.mathproject.Entity.Homework.Zuoye2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zuoye2Service {
    @Autowired
    Zuoye2Resp zuoye2Resp;

    public List<Zuoye2> getAllZuoye2() {
        return zuoye2Resp.findAll();
    }

    public void addZuoye2(Integer problemsetid,Integer zuoyeid) {
        Zuoye2 zuoye2=new Zuoye2();
        zuoye2.setProblemsetid(problemsetid);
        zuoye2.setZuoyeid(zuoyeid);
        zuoye2Resp.save(zuoye2);

    }

    public void deleteZuoye2ById(Integer id){
        zuoye2Resp.deleteById(id);
    }
}
