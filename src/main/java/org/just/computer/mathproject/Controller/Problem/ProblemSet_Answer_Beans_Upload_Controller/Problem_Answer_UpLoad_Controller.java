package org.just.computer.mathproject.Controller.Problem.ProblemSet_Answer_Beans_Upload_Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Service.Problem.ProblemAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController
@Api(tags ="USER/提交答案")
@RequestMapping("/ProblemAnswer_UpLoadController/")
public class Problem_Answer_UpLoad_Controller {
    @Autowired
    ProblemAnswerService problemAnswerService;
    @ApiOperation(value = "添加证明题答案")
    @PostMapping("/UpLoadAnswer")
    public Boolean InsertProblemAnswer(
            @RequestBody Map<String,Object> params,
            Principal pl){
        try {
            problemAnswerService.addProblemAnswer(
                    Integer.valueOf(params.get("problemsetid").toString()),
                    Integer.valueOf(params.get("score").toString()),
                    params.get("body").toString(),
                    pl.getName());
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
