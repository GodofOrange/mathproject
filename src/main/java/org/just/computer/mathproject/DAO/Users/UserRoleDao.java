package org.just.computer.mathproject.DAO.Users;

import org.just.computer.mathproject.Entity.users.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleDao extends JpaRepository<UserRole,Integer> {
}
