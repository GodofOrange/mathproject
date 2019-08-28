package org.just.computer.mathproject.Controller.Students;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Students._Class;
import org.just.computer.mathproject.Service.Students.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="班级")
@RequestMapping("/Class/")
public class ClassController {
    @Autowired
    ClassService classService;

    @ApiOperation(value ="获得所有班级")
    @GetMapping("/getAllClass")
    public List<_Class> getAllClass(){
        return classService.getAllClass();
    }

    @ApiOperation(value = "添加班级")
    @GetMapping("/addClass")
    public Boolean getAllClass(@RequestParam Integer teacherid, @RequestParam String classname){
        try {
            classService.addClass(teacherid,classname);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除班级")
    @GetMapping("/deleteClass")
    public Boolean deleteClassById(Integer id){
        try{
           classService.deleteclassById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
