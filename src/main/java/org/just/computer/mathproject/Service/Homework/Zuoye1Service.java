package org.just.computer.mathproject.Service.Homework;

import org.just.computer.mathproject.DAO.Homework.Zuoye1Resp;
import org.just.computer.mathproject.Entity.Homework.Zuoye1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class Zuoye1Service {
    @Autowired
    Zuoye1Resp zuoye1Resp;

    public List<Zuoye1> getAllZuoye1() {
        return zuoye1Resp.findAll();
    }

    public void addZuoye1(Integer classid) {
        Zuoye1 zuoye1=new Zuoye1();
        zuoye1.setClassid(classid);
        zuoye1.setDatatime(new Date());
        zuoye1Resp.save(zuoye1);

    }

    public void deleteZuoye1ById(Integer id){
        zuoye1Resp.deleteById(id);
    }
}
