package org.just.computer.mathproject.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Advertisement;
import org.just.computer.mathproject.Service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="广告")
@RequestMapping("/Advertisement/")
public class AdvertisementController {
    @Autowired
    AdvertisementService advertisementService;

    @ApiOperation(value ="获得所有广告")
    @GetMapping("/getAllAdvertisement")
    public List<Advertisement> getAllAdvertisement(){
        return advertisementService.getAllAdvertisement();
    }
    @ApiOperation(value = "添加广告")
    @GetMapping("/addAdvertisement")
    public Boolean getAllAdvertisement(@RequestParam String img, @RequestParam String href){
        try {
            advertisementService.addAdvertisement(img,href);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除广告")
    @GetMapping("/deleteAdvertisement")
    public Boolean deleteAdvertisementById(Integer id){
       try{
           advertisementService.deleteAdvertisementById(id);
           return true;
       }catch (Exception e){
           return false;
       }
    }
}
