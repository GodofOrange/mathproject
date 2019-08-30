package org.just.computer.mathproject.DAO.Book;

import org.just.computer.mathproject.Entity.Book.ExampleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleCommentResp extends JpaRepository<ExampleComment,Integer> {
}
