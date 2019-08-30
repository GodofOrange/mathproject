package org.just.computer.mathproject.Service.Book;

import org.just.computer.mathproject.DAO.Book.ExampleResp;
import org.just.computer.mathproject.Entity.Book.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {
    @Autowired
    ExampleResp exampleResp;

    public List<Example> getAllExample() {
        return exampleResp.findAll();
    }

    public void addExample(Integer chapterid,String title) {
        Example example=new Example();
        example.setChapterid(chapterid);
        example.setTitle(title);
        exampleResp.save(example);
    }

    public void deleteExampleById(Integer id){
        exampleResp.deleteById(id);
    }
}
