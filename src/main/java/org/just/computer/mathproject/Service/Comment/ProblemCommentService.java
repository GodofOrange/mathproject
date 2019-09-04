package org.just.computer.mathproject.Service.Comment;

import org.just.computer.mathproject.DAO.Comment.ProblemCommentResp;
import org.just.computer.mathproject.Entity.Comment.ProblemComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProblemCommentService {
    @Autowired
    ProblemCommentResp problemCommentResp;

    public List<ProblemComment> getAllProblemComment() {
        return problemCommentResp.findAll();
    }

    public void addProblemComment(String content,String username,Integer problemsetid) {
        ProblemComment problemComment=new ProblemComment();
        problemComment.setContent(content);
        problemComment.setUsername(username);
        problemComment.setTime(new Date());
        problemComment.setProblemsetid(problemsetid);
        problemCommentResp.save(problemComment);
    }
    public List<ProblemComment> findAllCommentByProblemsetid(Integer id){
        return problemCommentResp.findAllByProblemsetidEquals(id);
    }
    public void deleteProblemCommentById(Integer id){
        problemCommentResp.deleteById(id);
    }
}
