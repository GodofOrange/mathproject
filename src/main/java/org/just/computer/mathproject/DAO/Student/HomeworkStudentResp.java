package org.just.computer.mathproject.DAO.Student;

import org.just.computer.mathproject.Entity.Students.HomeworkStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkStudentResp extends JpaRepository<HomeworkStudent,Integer> {
}
