package org.just.computer.mathproject.Service.User;

import org.just.computer.mathproject.DAO.Users.RoleDao;
import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.Entity.users.SecUser;
import org.just.computer.mathproject.Entity.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserDao userDao;
    @Autowired
    RoleDao roleDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findUserByUsername(username);
        SecUser secUser = new SecUser();
        if(user==null){
            throw new UsernameNotFoundException("账户不存在");
        }
        secUser.setRoles(roleDao.getUserRolesByUid(user.getId()));
        secUser.setEnabled(user.getEnabled());
        secUser.setId(user.getId());
        secUser.setPassword(user.getPassword());
        secUser.setUsername(user.getUsername());
        secUser.setLocked(user.getLocked());
        return secUser;
    }
}
