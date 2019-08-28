package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.HomeworkQuestionResp;
import org.just.computer.mathproject.Entity.Students.HomeworkQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkQuestionService {
    @Autowired
    HomeworkQuestionResp homeworkQuestionResp;

    public List<HomeworkQuestion> getAllHomeworkQuestion() {
        return homeworkQuestionResp.findAll();
    }

    public void addHomeworkQuestion(Integer homeworkid,Integer questionid) {
        HomeworkQuestion homeworkQuestion=new HomeworkQuestion();
        homeworkQuestion.setHomeworkid(homeworkid);
        homeworkQuestion.setQuestionid(questionid);
        homeworkQuestionResp.save(homeworkQuestion);
    }

    public void deleteHomeworkQuestionById(Integer id){
        homeworkQuestionResp.deleteById(id);
    }
}
