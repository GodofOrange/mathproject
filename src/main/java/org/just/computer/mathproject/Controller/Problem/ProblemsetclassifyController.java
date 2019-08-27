package org.just.computer.mathproject.Controller.Problem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.Problemsetclassify;
import org.just.computer.mathproject.Service.Problem.ProblemsetclassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="题目分类关系")
@RequestMapping("/Problemsetclassfiy/")
public class ProblemsetclassifyController {
    @Autowired
    ProblemsetclassifyService problemsetclassifyService;

    @ApiOperation(value ="获得所有题目分类关系")
    @GetMapping("/getAllProblemsetclassify")
    public List<Problemsetclassify> getAllProblemsetclassify(){
        return problemsetclassifyService.getAllProblemsetclassify();
    }

    @ApiOperation(value = "添加题目分类关系")
    @GetMapping("/addProblemsetclassify")
    public Boolean getAllProblemsetclassify(@RequestParam Integer problemsetid,@RequestParam Integer problemclassifyid){
        try {
            problemsetclassifyService.addProblemsetclassify(problemsetid,problemclassifyid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除题目分类关系")
    @GetMapping("/deleteProblemsetclassify")
    public Boolean deleProblemsetclassifyById(Integer id){
        try{
            problemsetclassifyService.deleteProblemsetclassifyById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
