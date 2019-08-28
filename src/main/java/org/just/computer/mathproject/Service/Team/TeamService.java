package org.just.computer.mathproject.Service.Team;

import org.just.computer.mathproject.DAO.Team.TeamResp;
import org.just.computer.mathproject.Entity.Team.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    TeamResp teamResp;

    public List<Team> getAllTeam() {
        return teamResp.findAll();
    }

    public void addTeam(String teamname,Integer contestid,Integer teacherid) {
        Team team=new Team();
        team.setTeamname(teamname);
        team.setContestid(contestid);
        team.setTeacherid(teacherid);
        teamResp.save(team);
    }

    public void deleteTeamById(Integer id){
        teamResp.deleteById(id);
    }
}
