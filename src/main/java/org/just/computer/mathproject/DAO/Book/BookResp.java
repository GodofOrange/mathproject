package org.just.computer.mathproject.DAO.Book;

import org.just.computer.mathproject.Entity.Book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookResp extends JpaRepository<Book,Integer> {
}
