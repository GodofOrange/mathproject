package org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services;

import org.just.computer.mathproject.DAO.Problem.ProblembodyResp;
import org.just.computer.mathproject.DAO.Problem.ProblemsetResp;
import org.just.computer.mathproject.Entity.Problem.Problembody;
import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProblemSet_ProblemBody_Service {
    @Autowired
    ProblemsetResp problemsetResp;
    @Autowired
    ProblembodyResp problembodyResp;
    public void addNewProblemByAdmin(String title,String level,String body,String answer,String kind,String standard){
        Problemset problemset = new Problemset();
        problemset.setEnabled(1);
        problemset.setLevel(level);
        problemset.setTitle(title);
        problemsetResp.save(problemset);
        problemset = problemsetResp.findByTitleEquals(title);
        Problembody problembody = new Problembody();
        problembody.setAnswer(answer);
        problembody.setProblemsetid(problemset.getId());
        problembody.setBody(body);
        problembody.setKind(kind);
        problembody.setStandard(standard);
        problembodyResp.save(problembody);
    }
}
