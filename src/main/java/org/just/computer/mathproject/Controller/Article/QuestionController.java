package org.just.computer.mathproject.Controller.Article;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Article.Question;
import org.just.computer.mathproject.Service.Article.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags ="问题")
@RequestMapping("/Question/")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @ApiOperation(value ="获得所有问题")
    @GetMapping("/getAllQuestion")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @ApiOperation(value = "添加问题")
    @PostMapping("/addQuestion")
    public Boolean addNewQuestion(@RequestBody Map<String,Object> params, Principal pl){
        try {
            questionService.addQuestion(params.get("title").toString(),params.get("content").toString(),pl.getName(),0);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除问题")
    @GetMapping("/deleteQuestion")
    public Boolean deleteQuestionById(Integer id){
        try{
            questionService.deleteQuestionById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @ApiOperation(value = "我问过的问题")
    @GetMapping("/getMyQuestion")
    public List<Question> getMyQuestion(Principal pl){
        return questionService.getMyQuestion(pl.getName());
    }
}
