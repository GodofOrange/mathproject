package org.just.computer.mathproject.Controller.Students;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Students.Student;
import org.just.computer.mathproject.Service.Students.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="学生")
@RequestMapping("/Student/")
public class StudentController {
    @Autowired
    StudentService studentService;

    @ApiOperation(value ="获得所有学生")
    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @ApiOperation(value = "添加学生")
    @GetMapping("/addStudent")
    public Boolean getAllStudent(@RequestParam Integer userid, @RequestParam Integer vip){
        try {
            studentService.addStudent(userid,vip);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除学生")
    @GetMapping("/deleteStudent")
    public Boolean deleteStudentById(Integer id){
        try{
            studentService.deleteStudentById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
