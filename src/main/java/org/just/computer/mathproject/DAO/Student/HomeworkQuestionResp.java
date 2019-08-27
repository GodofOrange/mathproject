package org.just.computer.mathproject.DAO.Student;

import org.just.computer.mathproject.Entity.Students.HomeworkQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkQuestionResp extends JpaRepository<HomeworkQuestion,Integer> {
}
