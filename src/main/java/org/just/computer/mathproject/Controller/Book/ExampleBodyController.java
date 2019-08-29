package org.just.computer.mathproject.Controller.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Book.ExampleBody;
import org.just.computer.mathproject.Service.Book.ExampleBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="例题主体")
@RequestMapping("/ExampleBody/")
public class ExampleBodyController {
    @Autowired
    ExampleBodyService exampleBodyService;

    @ApiOperation(value ="获得所有例题主体")
    @GetMapping("/getAllExampleBody")
    public List<ExampleBody> getAllExampleBody(){
        return exampleBodyService.getAllExampleBody();
    }

    @ApiOperation(value = "添加例题主体")
    @PostMapping("/addExampleBody")
    public Boolean getAllExampleBody(@RequestParam Integer exampleid,@RequestParam String body,@RequestParam String answer){
        try {
            exampleBodyService.addExampleBody(exampleid,body,answer);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除例题主体")
    @GetMapping("/deleteExampleBody")
    public Boolean deleteExampleBodyById(Integer id){
        try{
            exampleBodyService.deleteExampleBodyById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
