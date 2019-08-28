package org.just.computer.mathproject.Service.Team;

import org.just.computer.mathproject.DAO.Team.ContestResp;
import org.just.computer.mathproject.Entity.Team.Contest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ContestService {
    @Autowired
    ContestResp contestResp;

    public List<Contest> getAllContest() {
        return contestResp.findAll();
    }

    public void addContest(String title,String information,Integer enabled) {
        Contest content=new Contest();
        content.setTitle(title);
        content.setInformation(information);
        content.setTime(new Date());
        content.setUptime(new Date());
        content.setEnabled(enabled);
        contestResp.save(content);
    }

    public void deleteContestById(Integer id){
        contestResp.deleteById(id);
    }
}
