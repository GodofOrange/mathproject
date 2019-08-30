package org.just.computer.mathproject.DAO.Book;

import org.just.computer.mathproject.Entity.Book.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterResp extends JpaRepository<Chapter,Integer> {
}
