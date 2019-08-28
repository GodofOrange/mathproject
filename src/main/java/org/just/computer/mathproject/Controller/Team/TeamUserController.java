package org.just.computer.mathproject.Controller.Team;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Team.Team;
import org.just.computer.mathproject.Entity.Team.TeamUser;
import org.just.computer.mathproject.Service.Team.TeamUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="团队用户")
@RequestMapping("/TeamUser/")
public class TeamUserController {
    @Autowired
    TeamUserService teamUserService;

    @ApiOperation(value ="获得所有团队用户")
    @GetMapping("/getAllTeamUser")
    public List<TeamUser> getAllTeamUser(){
        return teamUserService.getAllTeamUser();
    }

    @ApiOperation(value = "添加团队用户")
    @GetMapping("/addTeamUser")
    public Boolean getAllTeamUser(@RequestParam Integer teamid, @RequestParam Integer userid){
        try {
            teamUserService.addTeamUser(teamid,userid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除团队用户")
    @GetMapping("/deleteTeamUser")
    public Boolean deleteTeamUserById(Integer id){
        try{
            teamUserService.deleteTeamUserById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
