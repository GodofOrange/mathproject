package org.just.computer.mathproject.DAO.Student;

import org.just.computer.mathproject.Entity.Students._Class;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassResp extends JpaRepository<_Class,Integer> {
    List<_Class> findAllByTeacheridEquals(Integer id);
}
