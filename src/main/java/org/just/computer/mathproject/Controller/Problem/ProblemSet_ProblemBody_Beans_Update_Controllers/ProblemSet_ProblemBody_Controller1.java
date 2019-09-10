package org.just.computer.mathproject.Controller.Problem.ProblemSet_ProblemBody_Beans_Update_Controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services.ProblemSet_ProblemBody_Service;
import org.just.computer.mathproject.Service.Problem.ProblemSet_ProblemBody_services.ProblemSet_ProblemBody_Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags ="题目/用户")
@RequestMapping("/ProblemSet_ProblemBody_Controller1/")
public class ProblemSet_ProblemBody_Controller1 {
    @Autowired
    ProblemSet_ProblemBody_Service1 problemSet_problemBody_service1;

    @ApiOperation(value = "添加题目")
    @PostMapping("/addProblem")
    public Boolean addProblem(
            @RequestBody Map<String,Object> params, Principal pl){
        try {
            problemSet_problemBody_service1.addNewProblemByUser(
                    params.get("title").toString(),
                    params.get("level").toString(),
                    params.get("body").toString(),
                    params.get("answer").toString(),
                    params.get("kind").toString(),
                    params.get("standard").toString(),
                    (List<String>) params.get("labels"),pl.getName(),
                    (List<Integer>)params.get("classify"));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
