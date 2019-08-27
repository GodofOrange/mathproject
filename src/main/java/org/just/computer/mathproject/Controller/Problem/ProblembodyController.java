package org.just.computer.mathproject.Controller.Problem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Problem.Problembody;
import org.just.computer.mathproject.Service.Problem.ProblembodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="题目主体")
@RequestMapping("/Problembody/")
public class ProblembodyController {
    @Autowired
    ProblembodyService problembodyService;

    @ApiOperation(value ="获得所有题目主体")
    @GetMapping("/getAllProblembody")
    public List<Problembody> getAllProblembody(){
        return problembodyService.getAllProblembody();
    }
    @ApiOperation(value = "添加题目主体")
    @GetMapping("/addProblembody")
    public Boolean getAllProblembody(@RequestParam Integer problemsetid,@RequestParam String body,@RequestParam String answer,@RequestParam String kind){
        try {
            problembodyService.addProblembody(problemsetid,body,answer,kind);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除题目主体")
    @GetMapping("/deleteProblembody")
    public Boolean deleProblembodyById(Integer id){
        try{
            problembodyService.deleteProblembodyById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
