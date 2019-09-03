package org.just.computer.mathproject.DAO.Book;

import org.just.computer.mathproject.Entity.Book.ExampleLinks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExampleLinksResp extends JpaRepository<ExampleLinks,Integer> {
    List<ExampleLinks> findAllByExampleidEquals(Integer id);
}
