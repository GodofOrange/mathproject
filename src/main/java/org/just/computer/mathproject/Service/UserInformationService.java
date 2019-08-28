package org.just.computer.mathproject.Service;

import org.just.computer.mathproject.DAO.UserInformationResp;
import org.just.computer.mathproject.Entity.Occupation;
import org.just.computer.mathproject.Entity.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInformationService {
    @Autowired
    UserInformationResp userInformationResp;

    public List<UserInformation> getAllUserInformation(){
        return userInformationResp.findAll();
    }

    public void addUserInformation(Integer userid,String img,String signature,String QQ,String iphone,String email,String grade,String major,String university,String college){
        UserInformation userInformation=new UserInformation();
        userInformation.setUserid(userid);
        userInformation.setImg(img);
        userInformation.setSignature(signature);
        userInformation.setQQ(QQ);
        userInformation.setIphone(iphone);
        userInformation.setEmail(email);
        userInformation.setGrade(grade);
        userInformation.setMajor(major);
        userInformation.setUniversity(university);
        userInformation.setCollege(college);
        userInformationResp.save(userInformation);
    }
    public void deleteUserInformationById(Integer id){
        userInformationResp.deleteById(id);
    }


}
