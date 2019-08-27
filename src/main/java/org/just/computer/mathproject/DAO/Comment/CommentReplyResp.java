package org.just.computer.mathproject.DAO.Comment;

import org.just.computer.mathproject.Entity.Comment.CommentReply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentReplyResp extends JpaRepository<CommentReply,Integer> {
}
