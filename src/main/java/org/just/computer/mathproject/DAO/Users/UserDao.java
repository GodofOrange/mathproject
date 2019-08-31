package org.just.computer.mathproject.DAO.Users;

import org.just.computer.mathproject.Entity.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findUserByUsername(String username);
    User findUserByIdEquals(Integer id);
}
