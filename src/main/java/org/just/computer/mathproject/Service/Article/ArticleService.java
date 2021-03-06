package org.just.computer.mathproject.Service.Article;

import org.just.computer.mathproject.DAO.Article.ArticleResp;
import org.just.computer.mathproject.DAO.Users.UserDao;
import org.just.computer.mathproject.Entity.Article.Article;
import org.just.computer.mathproject.Entity.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Date;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleResp articleResp;
    public List<Article> getAllArticle() {
        return articleResp.findAll();
    }

    public void addArticle(Principal pl,String title, String content) {
        Article article=new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setUserid(pl.getName());
        article.setEnabled(1);
        article.setTime(new Date());
        articleResp.save(article);
    }

    public void deleteArticleById(Integer id){
        articleResp.deleteById(id);
    }
}
