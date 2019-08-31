package org.just.computer.mathproject.DAO.Student;

import org.just.computer.mathproject.Entity.Students.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentClassResp extends JpaRepository<StudentClass,Integer> {
    List<StudentClass> findAllByUseridEquals(Integer id);
    List<StudentClass> findAllByClassidEquals(Integer id);
}
