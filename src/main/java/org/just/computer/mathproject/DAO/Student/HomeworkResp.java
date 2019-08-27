package org.just.computer.mathproject.DAO.Student;

import org.just.computer.mathproject.Entity.Students.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkResp extends JpaRepository<Homework,Integer> {
}
