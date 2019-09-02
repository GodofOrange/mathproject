package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemsetResp;
import org.just.computer.mathproject.DAO.Problem.ProblemsetlabelResp;
import org.just.computer.mathproject.Entity.Problem.ProblemLabel;
import org.just.computer.mathproject.Entity.Problem.ProblemsetLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemsetLabelService {
    @Autowired
    ProblemsetlabelResp problemsetlabelResp;

    public List<ProblemsetLabel> getAllProblemsetLabel() {
        return problemsetlabelResp.findAll();
    }
    public List<ProblemsetLabel> getProblemsetLableById(Integer id){
        return problemsetlabelResp.findByProblemlabelidEquals(id);
    }

    public void addProblemsetLabel(Integer problemsetid,Integer problemlabelid) {
        ProblemsetLabel problemsetLabel =new ProblemsetLabel();
        problemsetLabel.setProblemsetid(problemsetid);
        problemsetLabel.setProblemlabelid(problemlabelid);
        problemsetlabelResp.save(problemsetLabel);
    }

    public void deleteProblemsetLabelById(Integer id){
        problemsetlabelResp.deleteById(id);
    }
}
