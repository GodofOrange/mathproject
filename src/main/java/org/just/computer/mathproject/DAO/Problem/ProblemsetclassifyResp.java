package org.just.computer.mathproject.DAO.Problem;

import io.swagger.models.auth.In;
import org.just.computer.mathproject.Entity.Problem.ProblemsetClassify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProblemsetclassifyResp extends JpaRepository<ProblemsetClassify,Integer> {
    @Query(value = "select problemsetid from problemsetclassify where problemclassifyid=:problemclassifyid",nativeQuery = true)
    List<Integer> getProblemsetIdByProblemclassifyid(Integer problemclassifyid);
}
