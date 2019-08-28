package org.just.computer.mathproject.Controller.Problem.ProblemSet_ProblemBody_Beans_Update_Controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services.ProblemSet_ProblemBody_Service;
import org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services.ProblemSet_ProblemBody_Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags ="题目/用户")
@RequestMapping("/ProblemSet_ProblemBody_Controller1/")
public class ProblemSet_ProblemBody_Controller1 {
    @Autowired
    ProblemSet_ProblemBody_Service1 problemSet_problemBody_service1;

    @ApiOperation(value = "添加题目")
    @GetMapping("/addProblem")
    public Boolean getProblem(@RequestParam String title,@RequestParam String level,@RequestParam String body,@RequestParam String answer,@RequestParam String kind){
        try {
            problemSet_problemBody_service1.addNewProblemByUser(title,level,body,answer,kind);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
