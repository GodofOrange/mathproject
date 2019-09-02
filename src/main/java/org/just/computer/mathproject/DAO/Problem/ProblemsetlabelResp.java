package org.just.computer.mathproject.DAO.Problem;

import org.just.computer.mathproject.Entity.Problem.ProblemsetLabel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemsetlabelResp extends JpaRepository<ProblemsetLabel,Integer> {
    List<ProblemsetLabel> findByProblemlabelidEquals(Integer id);
}
