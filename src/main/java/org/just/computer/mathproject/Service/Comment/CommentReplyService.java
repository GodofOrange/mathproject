package org.just.computer.mathproject.Service.Comment;

import org.just.computer.mathproject.DAO.Comment.CommentReplyResp;
import org.just.computer.mathproject.Entity.Comment.CommentReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommentReplyService {
    @Autowired
    CommentReplyResp commentReplyResp;

    public List<CommentReply> getAllCommentReply() {
        return commentReplyResp.findAll();
    }

    public void addCommentReply(String content,String username,Integer problemcommentid) {
        CommentReply commentReply=new CommentReply();
        commentReply.setContent(content);
        commentReply.setUsername(username);
        commentReply.setTime(new Date());
        commentReply.setProblemcommentid(problemcommentid);
        commentReplyResp.save(commentReply);
    }

    public void deleteCommentReplyById(Integer id){
        commentReplyResp.deleteById(id);
    }
}
