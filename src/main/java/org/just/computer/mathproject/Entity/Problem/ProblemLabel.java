package org.just.computer.mathproject.Entity.Problem;

import javax.persistence.*;
/**
 * 题目标签表
 */
@Entity(name="Problemlabel")
public class ProblemLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "name",columnDefinition = "varchar(32)")
    private String name;
    @Column(name = "problemsetid",columnDefinition = "bigint")
    private Integer problemsetid;

    public Integer getProblemsetid() {
        return problemsetid;
    }

    public void setProblemsetid(Integer problemsetid) {
        this.problemsetid = problemsetid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
