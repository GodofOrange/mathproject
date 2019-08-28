package org.just.computer.mathproject.Service.Article;

import org.just.computer.mathproject.DAO.Article.ArticleResp;
import org.just.computer.mathproject.Entity.Article.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleResp articleResp;

    public List<Article> getAllArticle() {
        return articleResp.findAll();
    }

    public void addArticle(String title,String content,Integer userid,Integer enabled) {
        Article article=new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setUserid(userid);
        article.setEnabled(enabled);
        article.setTime(new Date());
        articleResp.save(article);
    }

    public void deleteArticleById(Integer id){
        articleResp.deleteById(id);
    }
}
