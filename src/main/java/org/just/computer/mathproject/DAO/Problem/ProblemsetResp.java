package org.just.computer.mathproject.DAO.Problem;


import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemsetResp extends JpaRepository<Problemset,Integer> {
    Problemset findByTitleEquals(String title);
}
