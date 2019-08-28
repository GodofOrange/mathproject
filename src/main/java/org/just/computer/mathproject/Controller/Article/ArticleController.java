package org.just.computer.mathproject.Controller.Article;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Article.Article;
import org.just.computer.mathproject.Service.Article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags ="文章")
@RequestMapping("/Article/")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @ApiOperation(value ="获得所有文章")
    @GetMapping("/getAllArticle")
    public List<Article> getAllArticle(){
        return articleService.getAllArticle();
    }

    @ApiOperation(value = "添加文章")
    @PostMapping("/addArticle")
    public Boolean getAllArticle(@RequestParam String title, @RequestParam String content, @RequestParam Integer userid,@RequestParam Integer enabled){
        try {
            articleService.addArticle(title,content,userid,enabled);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value = "删除文章")
    @GetMapping("/deleteArticle")
    public Boolean deleteArticleById(Integer id){
        try{
            articleService.deleteArticleById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
