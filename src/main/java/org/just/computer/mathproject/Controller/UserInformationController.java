package org.just.computer.mathproject.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Occupation;
import org.just.computer.mathproject.Entity.UserInformation;
import org.just.computer.mathproject.Service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
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
    @PostMapping("/addUserInformation")
    public Boolean getAllUserInformation(Principal pl,@RequestParam String img,@RequestParam String signature,@RequestParam String QQ,@RequestParam String iphone,@RequestParam String email,@RequestParam String grade,@RequestParam String major,@RequestParam String university,@RequestParam String college){
        try{
            userInformationService.addUserInformation(pl,img,signature,QQ,iphone,email,grade,major,university,college);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "改变用户信息")
    @PostMapping("/updateUserInformation")
    public Boolean updateUserInformation(Principal pl,
                                         @RequestParam String img,
                                         @RequestParam String signature,
                                         @RequestParam String QQ,
                                         @RequestParam String iphone,
                                         @RequestParam String email,
                                         @RequestParam String grade,
                                         @RequestParam String major,
                                         @RequestParam String university,
                                         @RequestParam String college){
        try{
            userInformationService.updateUserInformation(pl,img,signature,QQ,iphone,email,grade,major,university,college);
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
    @ApiOperation(value = "获取我的信息")
    @GetMapping("/getMyInformation")
    public UserInformation getMyInfoMation(Principal pl){
        try {
            return userInformationService.getUserInfomationByUsername(pl);
        }catch (Exception e){
            return new UserInformation();
        }
    }
}
