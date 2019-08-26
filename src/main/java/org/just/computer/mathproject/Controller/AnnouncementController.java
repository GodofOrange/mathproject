package org.just.computer.mathproject.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Announcement;
import org.just.computer.mathproject.Service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@Api(tags ="公告模板")
@RequestMapping("/Announcement/")
public class AnnouncementController {
    @Autowired
    AnnouncementService announcementService;
    @ApiOperation(value ="获得所有公告")
    @GetMapping("/getAllAnnouncement")
    public List<Announcement> getAllAnnouncement(){
        return announcementService.getAllAnnouncement();
    }
    @ApiOperation(value = "添加公告")
    @GetMapping("/addAnnouncement")
    public Boolean getAllAnnouncement(@RequestParam String title,@RequestParam String content){
        try {
            announcementService.addAnnouncement(title,content);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
