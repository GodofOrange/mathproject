package org.just.computer.mathproject.Controller.Problem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.ProblemLabel;
import org.just.computer.mathproject.Service.Problem.ProblemLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="题目标签")
@RequestMapping("/ProblemLabel/")
public class ProblemLabelController {
    @Autowired
    ProblemLabelService problemLabelService;

    @ApiOperation(value ="获得所有题目标签")
    @GetMapping("/getAllProblemLabel")
    public List<ProblemLabel> getAllProblemLabel(){
        return problemLabelService.getAllProblemLabel();
    }

    @ApiOperation(value ="获得单个题目标签")
    @GetMapping("/getProblemLabel")
    public List<ProblemLabel> getProblemLabel(Integer id){
        return problemLabelService.getProblemLableById(id);
    }

    @ApiOperation(value = "添加题目标签")
    @GetMapping("/addProblemLabel")
    public Boolean getAllProblemLabel(@RequestParam String name){
        try {
            problemLabelService.addProblemLabel(name);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除题目标签")
    @GetMapping("/deleteProblemLabel")
    public Boolean deleteProblemLabelById(Integer id){
        try{
            problemLabelService.deleteProblemLabelById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
