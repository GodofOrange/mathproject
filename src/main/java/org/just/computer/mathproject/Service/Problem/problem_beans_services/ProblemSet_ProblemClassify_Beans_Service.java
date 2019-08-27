package org.just.computer.mathproject.Service.Problem.problem_beans_services;

import org.just.computer.mathproject.DAO.Problem.ProblemsetResp;
import org.just.computer.mathproject.DAO.Problem.ProblemsetclassifyResp;
import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemSet_ProblemClassify_Beans_Service {
    @Autowired
    ProblemsetResp problemsetResp;
    @Autowired
    ProblemsetclassifyResp problemsetclassifyResp;
    public List<Problemset> findProblemSetByProblemClassifyId(Integer problemclassifyid){
        List<Integer> l = problemsetclassifyResp.getProblemsetIdByProblemclassifyid(problemclassifyid);
        return problemsetResp.findAllById(l);
    }
}
