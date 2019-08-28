package org.just.computer.mathproject.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Occupation;
import org.just.computer.mathproject.Entity.UserInformation;
import org.just.computer.mathproject.Service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户信息")
@RequestMapping("/UserInformation/")
public class UserInformationController {
    @Autowired
    UserInformationService userInformationService;

    @ApiOperation(value = "获得所有用户信息")
    @GetMapping("/getAllUserInformation")
    public List<UserInformation> getAllUserInformation(){
        return userInformationService.getAllUserInformation();
    }

    @ApiOperation(value = "添加用户信息")
    @GetMapping("/addUserInformation")
    public Boolean getAllUserInformation(@RequestParam Integer userid,@RequestParam String img,@RequestParam String signature,@RequestParam String QQ,@RequestParam String iphone,@RequestParam String email,@RequestParam String grade,@RequestParam String major,@RequestParam String university,@RequestParam String college){
        try{
            userInformationService.addUserInformation(userid,img,signature,QQ,iphone,email,grade,major,university,college);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除用户信息")
    @GetMapping("/deleteUserInformation")
    public Boolean deleteUserInformationById(Integer id){
        try {
            userInformationService.deleteUserInformationById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
