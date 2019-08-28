package org.just.computer.mathproject.Service.Problem;

import org.just.computer.mathproject.DAO.Problem.ProblemAnswerResp;
import org.just.computer.mathproject.Entity.Problem.ProblemAnswer;
import org.just.computer.mathproject.Entity.Problem.Problembody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemAnswerService {
    @Autowired
    ProblemAnswerResp problemanswerResp;

    public List<ProblemAnswer> getAllProblemAnswer(){
        return problemanswerResp.findAll();
    }

    public void addProblemAnswer(Integer problemsetid,Integer score,String body,String username){
        ProblemAnswer problemAnswer=new ProblemAnswer();
        problemAnswer.setProblemsetid(problemsetid);
        problemAnswer.setScore(score);
        problemAnswer.setBody(body);
        problemAnswer.setUsername(username);
        problemanswerResp.save(problemAnswer);

    }

    public void deleteProblemAnswerById(Integer id){
        problemanswerResp.deleteById(id);
    }
}
