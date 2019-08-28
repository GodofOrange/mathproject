package org.just.computer.mathproject.DAO.Comment;

import org.just.computer.mathproject.Entity.Comment.ProblemComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemCommentResp extends JpaRepository<ProblemComment,Integer> {
}
