package org.just.computer.mathproject.Entity.Problem;

import javax.persistence.*;
/**
 * 题目分类关系表
 */
@Entity(name="Problemsetclassify")
public class ProblemsetClassify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "problemsetid",columnDefinition="bigint")
    private Integer problemsetid;
    @Column(name = "problemclassifyid",columnDefinition="bigint")
    private Integer problemclassifyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProblemsetid() {
        return problemsetid;
    }

    public void setProblemsetid(Integer problemsetid) {
        this.problemsetid = problemsetid;
    }

    public Integer getProblemclassifyid() {
        return problemclassifyid;
    }

    public void setProblemclassifyid(Integer problemclassifyid) {
        this.problemclassifyid = problemclassifyid;
    }
}
