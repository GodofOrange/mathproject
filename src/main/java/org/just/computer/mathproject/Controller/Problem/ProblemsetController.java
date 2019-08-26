package org.just.computer.mathproject.Controller.Problem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.just.computer.mathproject.Service.Problem.ProblemsetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="题目")
@RequestMapping("/Problemset/")
public class ProblemsetController {
    @Autowired
    ProblemsetService problemsetService;

    @ApiOperation(value ="获得所有题目")
    @GetMapping("/getAllProblemset")
    public List<Problemset> getAllProblemset(){
        return problemsetService.getAllProblemset();
    }

    @ApiOperation(value = "添加题目")
    @GetMapping("/addProblemset")
    public Boolean getAllProblemset(@RequestParam String title, @RequestParam Integer level,@RequestParam Integer enabled){
        try {
            problemsetService.addProblemset(title,level,enabled);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
