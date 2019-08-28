package org.just.computer.mathproject.Controller.Students;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Students.Homework;
import org.just.computer.mathproject.Service.Students.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="作业")
@RequestMapping("/Homework/")
public class HomeworkController {
    @Autowired
    HomeworkService homeworkService;

    @ApiOperation(value ="获得所有作业")
    @GetMapping("/getAllHomework")
    public List<Homework> getHomework(){
        return homeworkService.getAllHomework();
    }

    @ApiOperation(value = "添加作业")
    @GetMapping("/addHomework")
    public Boolean getAllClass(@RequestParam String title, @RequestParam Integer classid){
        try {
            homeworkService.addHomework(title,classid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除作业")
    @GetMapping("/deleteHomework")
    public Boolean deleteHomeworkById(Integer id){
        try{
            homeworkService.deleteHomeworkById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
