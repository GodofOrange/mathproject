package org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services;

import org.just.computer.mathproject.DAO.Problem.ProblembodyResp;
import org.just.computer.mathproject.DAO.Problem.ProblemlabelResp;
import org.just.computer.mathproject.DAO.Problem.ProblemsetResp;
import org.just.computer.mathproject.Entity.Problem.ProblemLabel;
import org.just.computer.mathproject.Entity.Problem.Problembody;
import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemSet_ProblemBody_Service {
    @Autowired
    ProblemsetResp problemsetResp;
    @Autowired
    ProblembodyResp problembodyResp;
    @Autowired
    ProblemlabelResp problemlabelResp;
    public void addNewProblemByAdmin(String title,String level,String body,String answer,String kind,String standard, List<String> labels,String upLoadusername){
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
        problembody.setUploadUsername(upLoadusername);
        problembody.setStandard(standard);
        problembodyResp.save(problembody);
        if(labels!=null)
        for(String str: labels){
            ProblemLabel problemLabel = new ProblemLabel();
            problemLabel.setName(str);
            problemLabel.setProblemsetid(problemset.getId());
            problemlabelResp.save(problemLabel);
        }
    }
}
