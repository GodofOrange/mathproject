package org.just.computer.mathproject.DAO;

import org.just.computer.mathproject.Entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInformationResp extends JpaRepository<UserInformation,Integer> {
}
