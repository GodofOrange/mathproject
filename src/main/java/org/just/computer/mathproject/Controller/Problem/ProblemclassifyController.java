package org.just.computer.mathproject.Controller.Problem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.ProblemClassify;
import org.just.computer.mathproject.Service.Problem.ProblemclassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="题目分类")
@RequestMapping("/Problemclassfiy/")
public class ProblemclassifyController {
    @Autowired
    ProblemclassifyService problemclassifyService;

    @ApiOperation(value ="获得所有题目分类")
    @GetMapping("/getAllProblemclassify")
    public List<ProblemClassify> getAllProblemclassify(){
        return problemclassifyService.getAllProblemclassify();
    }

    @ApiOperation(value = "添加题目分类")
    @GetMapping("/addProblemclassify")
    public Boolean getAllProblemclassify(@RequestParam String title){
        try {
            problemclassifyService.addProblemclassify(title);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除题目分类")
    @GetMapping("/deleteProblemclassify")
    public Boolean deleteProblemclassifyById(Integer id){
        try{
           problemclassifyService.deleteProblemclassifyById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
