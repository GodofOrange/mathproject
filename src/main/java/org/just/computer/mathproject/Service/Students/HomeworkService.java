package org.just.computer.mathproject.Service.Students;

import org.just.computer.mathproject.DAO.Student.HomeworkResp;
import org.just.computer.mathproject.Entity.Students.Homework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HomeworkService {
    @Autowired
    HomeworkResp homeworkResp;

    public List<Homework> getAllHomework() {
        return homeworkResp.findAll();
    }

    public void addHomework(String title,Integer classid) {
        Homework homework = new Homework();
        homework.setTitle(title);
        homework.setClassid(classid);
        homework.setTime(new Date());
        homeworkResp.save(homework);
    }

    public void deleteHomeworkById(Integer id){
        homeworkResp.deleteById(id);
    }
}
