package org.just.computer.mathproject.DAO.Article;

import org.just.computer.mathproject.Entity.Article.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionResp extends JpaRepository<Question,Integer> {
}
