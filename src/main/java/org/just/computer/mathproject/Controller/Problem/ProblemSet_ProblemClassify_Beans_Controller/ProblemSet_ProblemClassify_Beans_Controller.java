package org.just.computer.mathproject.Controller.Problem.ProblemSet_ProblemClassify_Beans_Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.just.computer.mathproject.Service.Problem.problem_beans_services.ProblemSet_ProblemClassify_Beans_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="分类题目列表获取")
@RequestMapping("/ProblemclassfiyListGet/")
public class ProblemSet_ProblemClassify_Beans_Controller {
    @Autowired
    ProblemSet_ProblemClassify_Beans_Service problemSet_problemClassify_beans_service;
    @ApiOperation(value ="获得所有题目分类")
    @GetMapping("/getListById")
    public List<Problemset> getListById(@RequestParam Integer id){
        return problemSet_problemClassify_beans_service.findProblemSetByProblemClassifyId(id);
    }
}
