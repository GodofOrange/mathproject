package org.just.computer.mathproject.Controller.Homework;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Homework.Zuoye1;
import org.just.computer.mathproject.Service.Homework.Zuoye1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="作业1")
@RequestMapping("/Zuoye1/")
public class Zuoye1Controller {
    @Autowired
    Zuoye1Service zuoye1Service;

    @ApiOperation(value ="获得所有作业1")
    @GetMapping("/getAllZuoye1")
    public List<Zuoye1> getAllZuoye1(){
        return zuoye1Service.getAllZuoye1();
    }

    @ApiOperation(value = "添加作业1")
    @GetMapping("/addZuoye1")
    public Boolean getAllZuoye1(@RequestParam Integer classid){
        try {
            zuoye1Service.addZuoye1(classid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除作业1")
    @GetMapping("/deleteZuoye1")
    public Boolean deleteZuoye1ById(Integer id){
        try{
            zuoye1Service.deleteZuoye1ById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
