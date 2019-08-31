package org.just.computer.mathproject.DAO.Book;

import org.just.computer.mathproject.Entity.Book.ExampleBody;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleBodyResp extends JpaRepository<ExampleBody,Integer> {
    ExampleBody findByExampleidEquals(Integer id);
}
