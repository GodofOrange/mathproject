package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemclassifyResp;
import org.just.computer.mathproject.Entity.Problem.Problemclassify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemclassifyService {
    @Autowired
    ProblemclassifyResp problemclassifyResp;

    public List<Problemclassify> getAllProblemclassify() {
        return problemclassifyResp.findAll();
    }

    public void addProblemclassify(String title) {
       Problemclassify problemclassify=new Problemclassify();
       problemclassify.setTitle(title);
       problemclassifyResp.save(problemclassify);
    }

    public void deleteProblemclassifyById(Integer id){
        problemclassifyResp.deleteById(id);
    }
}
