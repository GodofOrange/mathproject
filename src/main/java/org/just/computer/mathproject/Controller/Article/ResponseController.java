package org.just.computer.mathproject.Controller.Article;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Article.Response;
import org.just.computer.mathproject.Service.Article.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="回复")
@RequestMapping("/Response/")
public class ResponseController {
    @Autowired
    ResponseService responseService;

    @ApiOperation(value ="获得所有回复")
    @GetMapping("/getAllResponse")
    public List<Response> getAllResponse(){
        return responseService.getAllResponse();
    }

    @ApiOperation(value = "添加回复")
    @GetMapping("/addResponse")
    public Boolean getAllResponse(@RequestParam Integer questionid, @RequestParam String username, @RequestParam Integer enabled){
        try {
            responseService.addResponse(questionid,username,enabled);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除回复")
    @GetMapping("/deleteResponse")
    public Boolean deleteResponseById(Integer id){
        try{
            responseService.deleteResponseById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
