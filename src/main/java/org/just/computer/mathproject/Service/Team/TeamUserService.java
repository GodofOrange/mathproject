package org.just.computer.mathproject.Service.Team;

import org.just.computer.mathproject.DAO.Team.TeamUserResp;
import org.just.computer.mathproject.Entity.Team.TeamUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamUserService {
    @Autowired
    TeamUserResp teamUserResp;

    public List<TeamUser> getAllTeamUser() {
        return teamUserResp.findAll();
    }

    public void addTeamUser(Integer teamid,Integer userid) {
        TeamUser teamUser=new TeamUser();
        teamUser.setTeamid(teamid);
        teamUser.setUserid(userid);
        teamUserResp.save(teamUser);
    }

    public void deleteTeamUserById(Integer id){
        teamUserResp.deleteById(id);
    }
}
