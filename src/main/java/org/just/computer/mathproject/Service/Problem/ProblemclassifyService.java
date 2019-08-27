package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemclassifyResp;
import org.just.computer.mathproject.Entity.Problem.ProblemClassify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemclassifyService {
    @Autowired
    ProblemclassifyResp problemclassifyResp;

    public List<ProblemClassify> getAllProblemclassify() {
        return problemclassifyResp.findAll();
    }

    public void addProblemclassify(String title) {
       ProblemClassify problemclassify=new ProblemClassify();
       problemclassify.setTitle(title);
       problemclassifyResp.save(problemclassify);
    }

    public void deleteProblemclassifyById(Integer id){
        problemclassifyResp.deleteById(id);
    }
}
