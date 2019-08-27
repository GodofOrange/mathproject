package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblembodyResp;
import org.just.computer.mathproject.Entity.Problem.Problembody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblembodyService {
    @Autowired
    ProblembodyResp problembodyResp;

    public List<Problembody> getAllProblembody(){
        return problembodyResp.findAll();
    }

    public Problembody getProblembodyById(Integer id){
        return problembodyResp.findByIdEquals(id);
    }

    public void addProblembody(Integer problemsetid,String body,String answer,String kind){
        Problembody problembody=new Problembody();
        problembody.setProblemsetid(problemsetid);
        problembody.setBody(body);
        problembody.setAnswer(answer);
        problembody.setKind(kind);
        problembodyResp.save(problembody);
    }

    public void deleteProblembodyById(Integer id){
        problembodyResp.deleteById(id);
    }
}
