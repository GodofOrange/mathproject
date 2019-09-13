package org.just.computer.mathproject.Controller.Homework;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Homework.Zuoye3;
import org.just.computer.mathproject.Service.Homework.Zuoye3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="作业3")
@RequestMapping("/Zuoye3/")
public class Zuoye3Controller {
    @Autowired
    Zuoye3Service zuoye3Service;

    @ApiOperation(value ="获得所有作业3")
    @GetMapping("/getAllZuoye3")
    public List<Zuoye3> getAllZuoye3(){
        return zuoye3Service.getAllZuoye3();
    }

    @ApiOperation(value = "添加作业3")
    @GetMapping("/addZuoye3")
    public Boolean getAllZuoye3(@RequestParam String diy, @RequestParam Integer classifyid){
        try {
            zuoye3Service.addZuoye3(diy,classifyid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除作业3")
    @GetMapping("/deleteZuoye3")
    public Boolean deleteZuoye3ById(Integer id){
        try{
            zuoye3Service.deleteZuoye3ById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
