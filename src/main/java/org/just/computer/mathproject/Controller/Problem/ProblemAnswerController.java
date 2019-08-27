package org.just.computer.mathproject.Controller.Problem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.ProblemAnswer;
import org.just.computer.mathproject.Service.Problem.ProblemAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="提交答案")
@RequestMapping("/ProblemAnswer/")
public class ProblemAnswerController {
    @Autowired
    ProblemAnswerService problemAnswerService;

    @ApiOperation(value ="获得所有提交答案")
    @GetMapping("/getAllProblemAnswer")
    public List<ProblemAnswer> getAllProblemAnswer(){
        return problemAnswerService.getAllProblemAnswer();
    }

    @ApiOperation(value = "添加提交答案")
    @PostMapping("/addProblemAnswer")
    public Boolean getAllProblemAnswer(@RequestParam Integer problemsetid,@RequestParam Integer score, @RequestParam String body){
        try {
            problemAnswerService.addProblemAnswer(problemsetid,score,body);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除提交答案")
    @GetMapping("/deleteProblemAnswer")
    public Boolean deleteProblemAnswerById(Integer id){
        try{
            problemAnswerService.deleteProblemAnswerById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
