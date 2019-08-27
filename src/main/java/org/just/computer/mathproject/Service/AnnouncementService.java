package org.just.computer.mathproject.Service;

import org.just.computer.mathproject.DAO.AnnouncementResp;
import org.just.computer.mathproject.Entity.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AnnouncementService {
    @Autowired
    AnnouncementResp announcementResp;

    public List<Announcement> getAllAnnouncement(){
        return announcementResp.findAll();
    }
    public void addAnnouncement(String title, String content){
        Announcement announcement=new Announcement();
        announcement.setTitle(title);
        announcement.setContent(content);
        announcement.setTime(new Date());
        announcementResp.save(announcement);
    }
    public void deleteAnnouncementById(Integer id){
        announcementResp.deleteById(id);
    }
}
