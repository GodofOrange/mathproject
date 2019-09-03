package org.just.computer.mathproject.Controller.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Book.ExampleLinks;
import org.just.computer.mathproject.Service.Book.ExampleLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="例题相似题目推荐")
@RequestMapping("/ExampleLinksController/")
public class ExampleLinksController {
    @Autowired
    ExampleLinksService exampleLinksService;
    @ApiOperation(value ="获得所有例题")
    @GetMapping("/getAllExampleLinksById")
    public List<ExampleLinks> getAllExample(@RequestParam Integer id){
        return exampleLinksService.getExampleLinksByexampleid(id);
    }
}
