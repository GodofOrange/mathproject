package org.just.computer.mathproject.Entity.Problem;

import javax.persistence.*;

/**
 * 标签题目关系表
 */
@Entity(name="Problemsetlabel")
public class Problemsetlabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "problemsetid",columnDefinition="bigint")
    private Integer problemsetid;
    @Column(name = "problemlabelid",columnDefinition="bigint")
    private Integer problemlabelid;

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

    public Integer getProblemlabelid() {
        return problemlabelid;
    }

    public void setProblemlabelid(Integer problemlabelid) {
        this.problemlabelid = problemlabelid;
    }
}
