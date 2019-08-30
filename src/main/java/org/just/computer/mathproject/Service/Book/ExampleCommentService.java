package org.just.computer.mathproject.Service.Book;

import org.just.computer.mathproject.DAO.Book.ExampleCommentResp;
import org.just.computer.mathproject.Entity.Book.ExampleComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleCommentService {
    @Autowired
    ExampleCommentResp exampleCommentResp;

    public List<ExampleComment> getAllExampleComment() {
        return exampleCommentResp.findAll();
    }

    public void addExampleComment(Integer exampleid,String username,String content) {
        ExampleComment exampleComment=new ExampleComment();
        exampleComment.setExampleid(exampleid);
        exampleComment.setUsername(username);
        exampleComment.setContent(content);
        exampleCommentResp.save(exampleComment);
    }

    public void deleteExampleCommentById(Integer id){
        exampleCommentResp.deleteById(id);
    }
}
