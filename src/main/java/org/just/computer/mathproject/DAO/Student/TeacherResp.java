package org.just.computer.mathproject.DAO.Student;

import org.just.computer.mathproject.Entity.Students.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherResp extends JpaRepository<Teacher,Integer> {
}
