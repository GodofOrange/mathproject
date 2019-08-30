package org.just.computer.mathproject.Controller.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Book.ExampleComment;
import org.just.computer.mathproject.Service.Book.ExampleCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="例题评论")
@RequestMapping("/ExampleComment/")
public class ExampleCommentController {
    @Autowired
    ExampleCommentService exampleCommentService;

    @ApiOperation(value ="获得所有例题评论")
    @GetMapping("/getAllExampleComment")
    public List<ExampleComment> getAllExampleComment(){
        return exampleCommentService.getAllExampleComment();
    }

    @ApiOperation(value = "添加例题评论")
    @GetMapping("/addExampleComment")
    public Boolean getAllExampleComment(@RequestParam Integer exampleid,@RequestParam String username,@RequestParam String content){
        try {
            exampleCommentService.addExampleComment(exampleid,username,content);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除例题评论")
    @GetMapping("/deleteExampleComment")
    public Boolean deleteExampleCommentById(Integer id){
        try{
            exampleCommentService.deleteExampleCommentById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
