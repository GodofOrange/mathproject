package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemsetclassifyResp;
import org.just.computer.mathproject.Entity.Problem.Problemsetclassify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemsetclassifyService {
    @Autowired
    ProblemsetclassifyResp problemsetclassifyResp;

    public List<Problemsetclassify> getAllProblemsetclassify() {
        return problemsetclassifyResp.findAll();
    }

    public void addProblemsetclassify(Integer problemsetid,Integer problemclassifyid) {
        Problemsetclassify problemsetclassify=new Problemsetclassify();
        problemsetclassify.setProblemsetid(problemsetid);
        problemsetclassify.setProblemclassifyid(problemclassifyid);
        problemsetclassifyResp.save(problemsetclassify);
    }

    public void deleteProblemsetclassifyById(Integer id){
        problemsetclassifyResp.deleteById(id);
    }
}
