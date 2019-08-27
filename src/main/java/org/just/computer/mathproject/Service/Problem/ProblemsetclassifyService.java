package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemsetclassifyResp;
import org.just.computer.mathproject.Entity.Problem.ProblemsetClassify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemsetclassifyService {
    @Autowired
    ProblemsetclassifyResp problemsetclassifyResp;

    public List<ProblemsetClassify> getAllProblemsetclassify() {
        return problemsetclassifyResp.findAll();
    }

    public void addProblemsetclassify(Integer problemsetid,Integer problemclassifyid) {
        ProblemsetClassify problemsetclassify=new ProblemsetClassify();
        problemsetclassify.setProblemsetid(problemsetid);
        problemsetclassify.setProblemclassifyid(problemclassifyid);
        problemsetclassifyResp.save(problemsetclassify);
    }

    public void deleteProblemsetclassifyById(Integer id){
        problemsetclassifyResp.deleteById(id);
    }
}
