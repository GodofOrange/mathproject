package org.just.computer.mathproject.Controller.Students;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Students.HomeworkQuestion;
import org.just.computer.mathproject.Service.Students.HomeworkQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="作业问题")
@RequestMapping("/HomeworkQuestion/")
public class HomeworkQuestionController {
    @Autowired
    HomeworkQuestionService homeworkQuestionService;

    @ApiOperation(value ="获得所有作业问题")
    @GetMapping("/getAllHomeworkQuestion")
    public List<HomeworkQuestion> getHomeworkQuestion(){
        return homeworkQuestionService.getAllHomeworkQuestion();
    }

    @ApiOperation(value = "添加作业问题")
    @GetMapping("/addHomeworkQuestion")
    public Boolean getAllClass(@RequestParam Integer homeworkid, @RequestParam Integer questionid){
        try {
            homeworkQuestionService.addHomeworkQuestion(homeworkid,questionid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除作业问题")
    @GetMapping("/deleteHomeworkQuestion")
    public Boolean deleteHomeworkQuestionById(Integer id){
        try{
            homeworkQuestionService.deleteHomeworkQuestionById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
