package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemsetResp;
import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemsetService {
    @Autowired
    ProblemsetResp problemsetResp;

    public List<Problemset> getAllProblemset() {
        return problemsetResp.findAll();
    }

    public void addProblemset(String title, String level, Integer enabled) {
        Problemset problemset = new Problemset();
        problemset.setTitle(title);
        problemset.setLevel(level);
        problemset.setEnabled(enabled);
        problemsetResp.save(problemset);
    }

    public void deleteProblemsetById(Integer id){
        problemsetResp.deleteById(id);
    }
}
