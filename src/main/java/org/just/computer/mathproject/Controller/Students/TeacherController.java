package org.just.computer.mathproject.Controller.Students;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Students.Teacher;
import org.just.computer.mathproject.Service.Students.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="老师")
@RequestMapping("/Teacher/")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @ApiOperation(value ="获得所有老师")
    @GetMapping("/getAllTeacher")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }

    @ApiOperation(value = "添加老师")
    @GetMapping("/addTeacher")
    public Boolean getAllTeacher(@RequestParam Integer userid, @RequestParam Integer vip){
        try {
            teacherService.addTeacher(userid,vip);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除老师")
    @GetMapping("/deleteTeacher")
    public Boolean deleteTeacherById(Integer id){
        try{
            teacherService.deleteTeacherById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
