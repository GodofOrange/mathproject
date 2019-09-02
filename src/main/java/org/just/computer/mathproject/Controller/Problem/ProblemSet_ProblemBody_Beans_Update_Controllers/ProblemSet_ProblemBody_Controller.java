package org.just.computer.mathproject.Controller.Problem.ProblemSet_ProblemBody_Beans_Update_Controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services.ProblemSet_ProblemBody_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags ="题目/管理员")
@RequestMapping("/ProblemSet_ProblemBody_Controller/")
public class ProblemSet_ProblemBody_Controller {
    @Autowired
    ProblemSet_ProblemBody_Service problemSet_problemBody_service;

    @ApiOperation(value = "添加题目")
    @PostMapping("/addProblem")
    public Boolean addProblem(
            @RequestBody Map<String,Object> params, Principal pl){
        try {
            problemSet_problemBody_service.addNewProblemByAdmin(
                    params.get("title").toString(),
                    params.get("level").toString(),
                    params.get("body").toString(),
                    params.get("answer").toString(),
                    params.get("kind").toString(),
                    params.get("standard").toString(),
                    (List<String>) params.get("labels"),pl.getName());
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
