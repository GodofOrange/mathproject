package org.just.computer.mathproject.DAO.Team;

import org.just.computer.mathproject.Entity.Team.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamResp extends JpaRepository<Team,Integer> {
}
