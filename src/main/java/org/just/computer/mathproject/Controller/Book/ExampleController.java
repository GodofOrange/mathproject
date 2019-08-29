package org.just.computer.mathproject.Controller.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Book.Example;
import org.just.computer.mathproject.Service.Book.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="例题")
@RequestMapping("/Example/")
public class ExampleController {
    @Autowired
    ExampleService exampleService;

    @ApiOperation(value ="获得所有例题")
    @GetMapping("/getAllExample")
    public List<Example> getAllExample(){
        return exampleService.getAllExample();
    }

    @ApiOperation(value = "添加例题")
    @GetMapping("/addExample")
    public Boolean getAllExample(@RequestParam Integer chapterid,@RequestParam String title){
        try {
            exampleService.addExample(chapterid,title);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除例题")
    @GetMapping("/deleteExample")
    public Boolean deleteExampleById(Integer id){
        try{
            exampleService.deleteExampleById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
