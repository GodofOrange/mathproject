package org.just.computer.mathproject.Service.Homework;

import org.just.computer.mathproject.DAO.Homework.Zuoye4Resp;
import org.just.computer.mathproject.Entity.Homework.Zuoye4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zuoye4Service {
    @Autowired
    Zuoye4Resp zuoye4Resp;

    public List<Zuoye4> getAllZuoye4() {
        return zuoye4Resp.findAll();
    }

    public void addZuoye4(Integer zuoyeid,String username) {
        Zuoye4 zuoye4=new Zuoye4();
        zuoye4.setZuoyeid(zuoyeid);
        zuoye4.setUsername(username);
        zuoye4Resp.save(zuoye4);

    }

    public void deleteZuoye4ById(Integer id){
        zuoye4Resp.deleteById(id);
    }
}
