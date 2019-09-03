package org.just.computer.mathproject.Controller.Book.ExampleQuestionBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Service.Book.ExampleBeanServices.ExampleBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Api(tags ="USERS/用户题目上传")
@RequestMapping("/ExampleQuestionBeanController")
public class ExampleQuestionBeanController {
    @Autowired
    ExampleBeanService exampleBeanService;
    @ApiOperation(value = "添加例题")
    @PostMapping("/addExampleBody")
    public Boolean addExampleQuestion(@RequestBody Map<String,Object> params){
        try {
            exampleBeanService.addNewExampleQuestionByChapterid(
                    Integer.valueOf(params.get("chapterid").toString()),
                    params.get("title").toString(),
                    params.get("body").toString(),
                    params.get("answer").toString(),
                    (List<Integer>) params.get("links"));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
