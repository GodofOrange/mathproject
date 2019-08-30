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
    @Autowired
    UserDao userDao;
    public List<Article> getAllArticle() {
        return articleResp.findAll();
    }

    public void addArticle(Principal pl,String title, String content, Integer userid, Integer enabled) {
        Article article=new Article();
        User user= userDao.findUserByUsername(pl.getName());
        article.setTitle(title);
        article.setContent(content);
        article.setUserid(user.getId());
        article.setEnabled(enabled);
        article.setTime(new Date());
        articleResp.save(article);
    }

    public void deleteArticleById(Integer id){
        articleResp.deleteById(id);
    }
}
