package org.just.computer.mathproject.Controller.Team;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Team.Team;
import org.just.computer.mathproject.Service.Team.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="团队")
@RequestMapping("/Team/")
public class TeamController {
    @Autowired
    TeamService teamService;

    @ApiOperation(value ="获得所有团队")
    @GetMapping("/getAllTeam")
    public List<Team> getAllTeam(){
        return teamService.getAllTeam();
    }

    @ApiOperation(value = "添加团队")
    @GetMapping("/addTeam")
    public Boolean getAllTeam(@RequestParam String teamname, @RequestParam Integer contestid, @RequestParam Integer teacherid){
        try {
            teamService.addTeam(teamname,contestid,teacherid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除团队")
    @GetMapping("/deleteTeam")
    public Boolean deleteTeamById(Integer id){
        try{
            teamService.deleteTeamById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
