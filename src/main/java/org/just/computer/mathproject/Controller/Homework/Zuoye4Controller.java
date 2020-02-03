package org.just.computer.mathproject.Controller.Homework;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Homework.Zuoye4;
import org.just.computer.mathproject.Service.Homework.Zuoye4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="作业4")
@RequestMapping("/Zuoye4/")
public class Zuoye4Controller {
    @Autowired
    Zuoye4Service zuoye4Service;

    @ApiOperation(value ="获得所有作业4")
    @GetMapping("/getAllZuoye4")
    public List<Zuoye4> getAllZuoye4(){
        return zuoye4Service.getAllZuoye4();
    }

    @ApiOperation(value = "添加作业4")
    @GetMapping("/addZuoye4")
    public Boolean getAllZuoye4(@RequestParam Integer zuoyeid, @RequestParam String username){
        try {
            zuoye4Service.addZuoye4(zuoyeid,username);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除作业4")
    @GetMapping("/deleteZuoye4")
    public Boolean deleteZuoye4ById(Integer id){
        try{
            zuoye4Service.deleteZuoye4ById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
