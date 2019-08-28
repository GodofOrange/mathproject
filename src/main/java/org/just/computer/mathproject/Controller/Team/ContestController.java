package org.just.computer.mathproject.Controller.Team;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Team.Contest;
import org.just.computer.mathproject.Service.Team.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(tags ="比赛")
@RequestMapping("/Contest/")
public class ContestController {
    @Autowired
    ContestService contestService;

    @ApiOperation(value ="获得所有比赛")
    @GetMapping("/getAllContest")
    public List<Contest> getAllContest(){
        return contestService.getAllContest();
    }

    @ApiOperation(value = "添加比赛")
    @PostMapping("/addContest")
    public Boolean getAllContest(@RequestParam String title, @RequestParam String information, @RequestParam Integer enabled){
        try {
            contestService.addContest(title,information,enabled);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除比赛")
    @GetMapping("/deleteContest")
    public Boolean deleteContestById(Integer id){
        try{
            contestService.deleteContestById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
