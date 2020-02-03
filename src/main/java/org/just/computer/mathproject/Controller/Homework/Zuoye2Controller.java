package org.just.computer.mathproject.Controller.Homework;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Homework.Zuoye2;
import org.just.computer.mathproject.Service.Homework.Zuoye2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="作业2")
@RequestMapping("/Zuoye2/")
public class Zuoye2Controller {
    @Autowired
    Zuoye2Service zuoye2Service;

    @ApiOperation(value ="获得所有作业2")
    @GetMapping("/getAllZuoye2")
    public List<Zuoye2> getAllZuoye2(){
        return zuoye2Service.getAllZuoye2();
    }

    @ApiOperation(value = "添加作业2")
    @GetMapping("/addZuoye2")
    public Boolean getAllZuoye2(@RequestParam Integer problemsetid,@RequestParam Integer zuoyeid){
        try {
            zuoye2Service.addZuoye2(problemsetid,zuoyeid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除作业2")
    @GetMapping("/deleteZuoye2")
    public Boolean deleteZuoye2ById(Integer id){
        try{
            zuoye2Service.deleteZuoye2ById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
