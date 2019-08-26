package org.just.computer.mathproject.Service;

import org.just.computer.mathproject.DAO.AdvertisementResp;
import org.just.computer.mathproject.Entity.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementService {
    @Autowired
    AdvertisementResp advertisementResp;

    public List<Advertisement> getAllAdvertisement(){
        return advertisementResp.findAll();
    }
    public void addAdvertisement(String img,String href){
        Advertisement advertisement=new Advertisement();
        advertisement.setImg(img);
        advertisement.setHref(href);
        advertisementResp.save(advertisement);
    }
}
