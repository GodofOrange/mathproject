package org.just.computer.mathproject.Controller.Comment;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Comment.CommentReply;
import org.just.computer.mathproject.Service.Comment.CommentReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@Api(tags ="评论回复")
@RequestMapping("/CommentReply/")
public class CommentReplyController {
    @Autowired
    CommentReplyService commentReplyService;

    @ApiOperation(value ="获得评论回复")
    @GetMapping("/getAllCommentReply")
    public List<CommentReply> getAllCommentReply(){
        return commentReplyService.getAllCommentReply();
    }

    @ApiOperation(value = "添加评论回复")
    @PostMapping("/addCommentReply")
    public Boolean getAllCommentReply(@RequestParam String content, Principal pl, @RequestParam Integer problemcommentid){
        try {
            commentReplyService.addCommentReply(content,pl.getName(),problemcommentid);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @ApiOperation(value = "获得所有评论的id")
    @GetMapping("/getAllCommentReplyByid")
    public List<CommentReply> getAllCommentReplyById(Integer id) {
        return commentReplyService.getAllCommentReplyById(id);
    }
    @ApiOperation(value = "删除评论回复")
    @GetMapping("/deleteCommentReply")
    public Boolean deleteCommentReplyById(Integer id){
        try{
            commentReplyService.deleteCommentReplyById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
