package org.just.computer.mathproject.DAO.Problem;

import org.just.computer.mathproject.Entity.Problem.ProblemLabel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemlabelResp extends JpaRepository<ProblemLabel,Integer> {
    List<ProblemLabel> findByProblemsetidEquals(Integer id);
}
