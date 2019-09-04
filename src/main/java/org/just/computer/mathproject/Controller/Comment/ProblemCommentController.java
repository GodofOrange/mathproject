package org.just.computer.mathproject.Controller.Comment;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Comment.ProblemComment;
import org.just.computer.mathproject.Service.Comment.ProblemCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@Api(tags ="问题评论")
@RequestMapping("/ProblemComment/")
public class ProblemCommentController {
    @Autowired
    ProblemCommentService problemCommentService;

    @ApiOperation(value ="获得问题评论")
    @GetMapping("/getAllProblemComment")
    public List<ProblemComment> getAllProblemComment(){
        return problemCommentService.getAllProblemComment();
    }

    @ApiOperation(value = "添加问题评论")
    @PostMapping("/addProblemComment")
    public Boolean getAllProblemComment(@RequestParam String content, Principal pl, @RequestParam Integer problemsetid){
        try {
            problemCommentService.addProblemComment(content,pl.getName(),problemsetid);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @ApiOperation(value = "通过问题id，查找评论")
    @GetMapping("/getCommentByProblemsetId")
    public List<ProblemComment> findAllProblemCommentByid(@RequestParam Integer id){
        return problemCommentService.findAllCommentByProblemsetid(id);
    }
    @ApiOperation(value = "删除问题评论")
    @GetMapping("/deleteProblemComment")
    public Boolean deleteProblemCommentById(Integer id){
        try{
            problemCommentService.deleteProblemCommentById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
