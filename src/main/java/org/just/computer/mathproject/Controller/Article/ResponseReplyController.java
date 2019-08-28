package org.just.computer.mathproject.Controller.Article;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Article.ResponseReply;
import org.just.computer.mathproject.Service.Article.ResponseReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="回复的回复")
@RequestMapping("/ResponseReply/")
public class ResponseReplyController {
    @Autowired
    ResponseReplyService responseReplyService;

    @ApiOperation(value ="获得所有回复的回复")
    @GetMapping("/getAllResponseReply")
    public List<ResponseReply> getAllResponseReply(){
        return responseReplyService.getAllResponseReply();
    }

    @ApiOperation(value = "添加回复的回复")
    @PostMapping("/addResponseReply")
    public Boolean getAllResponse(@RequestParam Integer responseid,@RequestParam String content,@RequestParam Integer userid){
        try {
            responseReplyService.addResponseReply(responseid,content,userid);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除回复的回复")
    @GetMapping("/deleteResponseReply")
    public Boolean deleteResponseReplyById(Integer id){
        try{
            responseReplyService.deleteResponseReplyById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
