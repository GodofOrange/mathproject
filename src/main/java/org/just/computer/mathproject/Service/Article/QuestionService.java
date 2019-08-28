package org.just.computer.mathproject.Service.Article;

import org.just.computer.mathproject.DAO.Article.QuestionResp;
import org.just.computer.mathproject.Entity.Article.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionResp questionResp;

    public List<Question> getAllQuestion() {
        return questionResp.findAll();
    }

    public void addQuestion(String title,String content,String username,Integer enabled) {
        Question question=new Question();
        question.setTitle(title);
        question.setContent(content);
        question.setUsername(username);
        question.setTime(new Date());
        question.setEnabled(enabled);
        questionResp.save(question);
    }

    public void deleteQuestionById(Integer id){
        questionResp.deleteById(id);
    }
}
