package org.just.computer.mathproject.Service.Book.ExampleBeanServices;

import org.just.computer.mathproject.DAO.Book.ExampleBodyResp;
import org.just.computer.mathproject.DAO.Book.ExampleResp;
import org.just.computer.mathproject.Entity.Book.Example;
import org.just.computer.mathproject.Entity.Book.ExampleBody;
import org.just.computer.mathproject.Entity.Book.ExampleLinks;
import org.just.computer.mathproject.Service.Book.ExampleLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleBeanService {
    @Autowired
    ExampleBodyResp exampleBodyResp;
    @Autowired
    ExampleResp exampleResp;
    @Autowired
    ExampleLinksService exampleLinksService;
    public void addNewExampleQuestionByChapterid(Integer chapterid, String title, String body, String answer, List<Integer> list){
        Example example = new Example();
        example.setChapterid(chapterid);
        example.setTitle(title);
        Example example1 = exampleResp.save(example);
        ExampleBody exampleBody = new ExampleBody();
        exampleBody.setExampleid(example1.getId());
        exampleBody.setAnswer(answer);
        exampleBody.setBody(body);
        exampleBodyResp.save(exampleBody);
        exampleLinksService.addByExampleid(list,example1.getId());
    }
}
