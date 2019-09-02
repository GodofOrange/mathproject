package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemlabelResp;
import org.just.computer.mathproject.Entity.Problem.ProblemLabel;
import org.just.computer.mathproject.Entity.Problem.ProblemsetClassify;
import org.just.computer.mathproject.Entity.Problem.ProblemsetLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemLabelService {
    @Autowired
    ProblemlabelResp problemlabelResp;

    public List<ProblemLabel> getAllProblemLabel() {
        return problemlabelResp.findAll();
    }
    public List<ProblemLabel> getProblemLableById(Integer id){
        return problemlabelResp.findByProblemsetidEquals(id);
    }

    public void addProblemLabel(String name) {
        ProblemLabel problemLabel =new ProblemLabel();
        problemLabel.setName(name);
        problemlabelResp.save(problemLabel);
    }

    public void deleteProblemLabelById(Integer id){
        problemlabelResp.deleteById(id);
    }
}
