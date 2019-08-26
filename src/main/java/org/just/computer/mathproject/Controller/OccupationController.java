package org.just.computer.mathproject.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Occupation;
import org.just.computer.mathproject.Service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户资格接口")
@RequestMapping("/Occupation/")
public class OccupationController {
    @Autowired
    OccupationService occupationService;
    @ApiOperation(value = "获得所有用户资格种类")
    @GetMapping("/getAllOccupation")
    public List<Occupation> getAllOccupation(){
        return occupationService.getAllOccupation();
    }
    @ApiOperation(value = "添加用户资格种类")
    @GetMapping("/addOccupation")
    public Boolean getAllOccupation(@RequestParam String job){
        try{
            occupationService.addOccupation(job);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除用户资格种类")
    @GetMapping("/deleteOccupation")
    public Boolean deleteOccupationById(Integer id){
        try {
            occupationService.deleteOccupationById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
