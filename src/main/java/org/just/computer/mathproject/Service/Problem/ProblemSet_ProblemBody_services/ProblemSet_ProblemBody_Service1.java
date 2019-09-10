package org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services;

import org.just.computer.mathproject.Bean.ProblemSet_ProblemClassify;
import org.just.computer.mathproject.DAO.Problem.*;
import org.just.computer.mathproject.Entity.Problem.*;
import org.just.computer.mathproject.Service.Problem.ProblemsetclassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemSet_ProblemBody_Service1 {
    @Autowired
    ProblemsetResp problemsetResp;
    @Autowired
    ProblembodyResp problembodyResp;
    @Autowired
    ProblemlabelResp problemlabelResp;
    @Autowired
    ProblemsetclassifyResp problemsetclassifyResp;
    public void addNewProblemByUser(String title, String level, String body, String answer, String kind, String standard, List<String> labels,String upLoadusername,List<Integer> problemclassifyId){
        Problemset problemset = new Problemset();
        problemset.setEnabled(0);
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
        problembody.setUploadUsername(upLoadusername);
        problembodyResp.save(problembody);
        if(labels!=null)
        for(String str: labels){
            ProblemLabel problemLabel = new ProblemLabel();
            problemLabel.setName(str);
            problemLabel.setProblemsetid(problemset.getId());
            problemlabelResp.save(problemLabel);
        }
        for(Integer id:problemclassifyId) {
            ProblemsetClassify problemsetClassify = new ProblemsetClassify();
            problemsetClassify.setProblemclassifyid(id);
            problemsetClassify.setProblemsetid(problemset.getId());
            problemsetclassifyResp.save(problemsetClassify);
        }
    }
}
