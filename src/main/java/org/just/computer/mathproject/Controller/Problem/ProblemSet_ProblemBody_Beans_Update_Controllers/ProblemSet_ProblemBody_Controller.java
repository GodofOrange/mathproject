package org.just.computer.mathproject.Controller.Problem.ProblemSet_ProblemBody_Beans_Update_Controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services.ProblemSet_ProblemBody_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags ="题目/")
@RequestMapping("/ProblemSet_ProblemBody_Controller/")
public class ProblemSet_ProblemBody_Controller {
    @Autowired
    ProblemSet_ProblemBody_Service problemSet_problemBody_service;

    @ApiOperation(value = "添加题目")
    @GetMapping("/addProblem")
    public Boolean getProblem(@RequestParam String title,@RequestParam String level,@RequestParam String body,@RequestParam String answer,@RequestParam String kind){
        try {
            problemSet_problemBody_service.addNewProblemByAdmin(title,level,body,answer,kind);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
