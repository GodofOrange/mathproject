package org.just.computer.mathproject.Service;

import org.just.computer.mathproject.DAO.UserInformationResp;
import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.Entity.UserInformation;
import org.just.computer.mathproject.Entity.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class UserInformationService {
    @Autowired
    UserInformationResp userInformationResp;
    @Autowired
    UserDao userDao;
    public List<UserInformation> getAllUserInformation(){
        return userInformationResp.findAll();
    }

    public void addUserInformation(Principal pl,String img,String signature,String QQ,String iphone,String email,String grade,String major,String university,String college){
        UserInformation userInformation=new UserInformation();
        userInformation.setUserid(userDao.findUserByUsername(pl.getName()).getId());
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

    public void updateUserInformation(Principal pl, String img, String signature, String QQ, String iphone, String email, String grade, String major, String university, String college){
        UserInformation userInformation=new UserInformation();
        User user = userDao.findUserByUsername(pl.getName());
        userInformation.setUserid(user.getId());
        userInformation.setImg(img);
        userInformation.setSignature(signature);
        userInformation.setQQ(QQ);
        userInformation.setIphone(iphone);
        userInformation.setId(userInformationResp.findByUseridEquals(user.getId()).getId());
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

    public UserInformation getUserInfomationByUsername(Principal pl){
        return userInformationResp.findByUseridEquals(userDao.findUserByUsername(pl.getName()).getId());
    }
}
