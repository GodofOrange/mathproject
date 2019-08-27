package org.just.computer.mathproject.DAO.Problem;

import org.just.computer.mathproject.Entity.Problem.Problembody;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblembodyResp extends JpaRepository<Problembody,Integer> {
    Problembody findByIdEquals(Integer id);

}
