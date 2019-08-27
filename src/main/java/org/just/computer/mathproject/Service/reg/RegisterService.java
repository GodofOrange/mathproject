package org.just.computer.mathproject.Service.reg;

import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.DAO.Users.UserRoleDao;
import org.just.computer.mathproject.Entity.users.User;
import org.just.computer.mathproject.Entity.users.UserRole;
import org.just.computer.mathproject.Util.BCPEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    UserDao userDao;
    @Autowired
    UserRoleDao userRoleDao;
    public String register(String username,String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(BCPEncoder.encode(password));
        userDao.save(user);
        UserRole userRole = new UserRole();
        Integer i;
        try {
             i= userDao.findUserByUsername(username).getId();
        }catch (Exception e){
            e.printStackTrace();
            return "创建用户失败";
        }
        userRole.setUid(i);
        userRole.setRid(3);
        userRoleDao.save(userRole);
        return "成功";
    }
}
