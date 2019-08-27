package org.just.computer.mathproject.DAO.Users;

import org.just.computer.mathproject.Entity.users.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleDao extends JpaRepository<Role,Integer> {
    @Query(value = "select * from role r,user_role ur where r.id=ur.rid and ur.uid=:id",nativeQuery = true)
    List<Role> getUserRolesByUid(Integer id);
}
