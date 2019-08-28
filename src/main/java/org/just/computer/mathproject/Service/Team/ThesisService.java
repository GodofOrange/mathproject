package org.just.computer.mathproject.Service.Team;

import org.just.computer.mathproject.DAO.Team.ThesisResp;
import org.just.computer.mathproject.Entity.Team.Thesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThesisService {
    @Autowired
    ThesisResp thesisResp;

    public List<Thesis> getAllThesis() {
        return thesisResp.findAll();
    }

    public void addThesis(Integer contestid,Integer userid,String title,String body,Integer score,Integer enabled) {
        Thesis thesis=new Thesis();
        thesis.setContestid(contestid);
        thesis.setUserid(userid);
        thesis.setTitle(title);
        thesis.setBody(body);
        thesis.setScore(score);
        thesis.setEnabled(enabled);
        thesisResp.save(thesis);
    }

    public void deleteThesisById(Integer id){
        thesisResp.deleteById(id);
    }
}
