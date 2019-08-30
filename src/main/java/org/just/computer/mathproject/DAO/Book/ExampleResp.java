package org.just.computer.mathproject.DAO.Book;

import org.just.computer.mathproject.Entity.Book.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExampleResp extends JpaRepository<Example,Integer> {
    List<Example> findAllByChapteridEquals(Integer id);
}
