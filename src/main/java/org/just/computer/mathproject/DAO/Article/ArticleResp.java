package org.just.computer.mathproject.DAO.Article;

import org.just.computer.mathproject.Entity.Article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleResp extends JpaRepository<Article,Integer> {
}
