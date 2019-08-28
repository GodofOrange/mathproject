package org.just.computer.mathproject.DAO.Problem;

import org.just.computer.mathproject.Entity.Problem.ProblemAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemAnswerResp extends JpaRepository<ProblemAnswer,Integer> {
}
