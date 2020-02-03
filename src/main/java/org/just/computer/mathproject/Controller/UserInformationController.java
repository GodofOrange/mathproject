package org.just.computer.mathproject.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.UserInformation;
import org.just.computer.mathproject.Entity.users.User;
import org.just.computer.mathproject.Service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Map;

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
    public Boolean updateUserInformation(Principal pl, @RequestBody Map<String,Object> params){
        try{
            userInformationService.updateUserInformation(pl,
                    params.get("img").toString(),
                    params.get("signature").toString(),
                    params.get("qq").toString(),
                    params.get("iphone").toString(),
                    params.get("email").toString(),
                    params.get("grade").toString(),
                    params.get("major").toString(),
                    params.get("university").toString(),
                    params.get("college").toString());
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
            return null;
        }
    }
    @ApiOperation(value= "获取用户id+名字")
    @GetMapping("/getUserIdName")
    public List<User> getUserIdName(){
        return userInformationService.getUserInformationOfIdName();
    }
}
