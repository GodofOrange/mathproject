package org.just.computer.mathproject.DAO.Article;

import org.just.computer.mathproject.Entity.Article.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionResp extends JpaRepository<Question,Integer> {
    List<Question> findAllByUsernameEquals(String username);
}
