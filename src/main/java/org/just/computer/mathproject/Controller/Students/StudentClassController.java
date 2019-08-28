package org.just.computer.mathproject.Controller.Students;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Students.StudentClass;
import org.just.computer.mathproject.Service.Students.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="学生班级关系")
@RequestMapping("/StudentClass/")
public class StudentClassController {
    @Autowired
    StudentClassService studentClassService;

    @ApiOperation(value ="获得所有学生班级关系")
    @GetMapping("/getAllStudentClass")
    public List<StudentClass> getAllStudentClass(){
        return studentClassService.getAllStudentClass();
    }

    @ApiOperation(value = "添加学生班级关系")
    @GetMapping("/addStudentClass")
    public Boolean getAllClass(@RequestParam Integer userid, @RequestParam Integer classid){
        try {
            studentClassService.addStudentClass(userid,classid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除学生班级关系")
    @GetMapping("/deleteStudentClass")
    public Boolean deleteStudentClassById(Integer id){
        try{
            studentClassService.deleteStudentClassById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
