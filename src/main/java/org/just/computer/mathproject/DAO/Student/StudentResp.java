package org.just.computer.mathproject.DAO.Student;

import org.just.computer.mathproject.Entity.Students.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResp extends JpaRepository<Student,Integer> {
}

