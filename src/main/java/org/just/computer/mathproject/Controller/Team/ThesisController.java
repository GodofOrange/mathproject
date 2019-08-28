package org.just.computer.mathproject.Controller.Team;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Team.Thesis;
import org.just.computer.mathproject.Service.Team.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="论文")
@RequestMapping("/Thesis")
public class ThesisController {
    @Autowired
    ThesisService thesisService;

    @ApiOperation(value ="获得所有论文")
    @GetMapping("/getAllThesis")
    public List<Thesis> getAllThesis(){
        return thesisService.getAllThesis();
    }

    @ApiOperation(value = "添加论文")
    @PostMapping("/addThesis")
    public Boolean getAllThesis(@RequestParam Integer contestid,@RequestParam Integer userid,@RequestParam String title, @RequestParam String body, @RequestParam Integer score,@RequestParam Integer enabled){
        try {
            thesisService.addThesis(contestid,userid,title,body,score,enabled);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除论文")
    @GetMapping("/deleteThesis")
    public Boolean deleteThesisById(Integer id){
        try{
            thesisService.deleteThesisById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
