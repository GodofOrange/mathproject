package org.just.computer.mathproject.Controller.Problem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.ProblemsetLabel;
import org.just.computer.mathproject.Service.Problem.ProblemsetLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="题目标签关系")
@RequestMapping("/ProblemsetLabel/")
public class ProblemsetLabelController {
    @Autowired
    ProblemsetLabelService problemsetLabelService;

    @ApiOperation(value ="获得所有题目标签关系")
    @GetMapping("/getAllProblemsetLabel")
    public List<ProblemsetLabel> getAllProblemsetLabel(){
        return problemsetLabelService.getAllProblemsetLabel();
    }

    @ApiOperation(value ="获得单个题目标签关系")
    @GetMapping("/getProblemsetLabel")
    public ProblemsetLabel getProblemsetLabel(Integer id){
        return problemsetLabelService.getProblemsetLableById(id);
    }

    @ApiOperation(value = "添加题目标签关系")
    @GetMapping("/addProblemsetLabel")
    public Boolean getAllProblemsetLabel(@RequestParam Integer problemsetid,@RequestParam Integer problemlabelid){
        try {
            problemsetLabelService.addProblemsetLabel(problemsetid,problemlabelid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除题目标签关系")
    @GetMapping("/deleteProblemsetLabel")
    public Boolean deleteProblemsetLabelById(Integer id){
        try{
            problemsetLabelService.deleteProblemsetLabelById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
