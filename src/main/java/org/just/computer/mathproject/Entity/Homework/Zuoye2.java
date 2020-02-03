package org.just.computer.mathproject.Entity.Homework;

import javax.persistence.*;

/**
 * 作业2表
 */
@Entity(name="Zuoye2")
public class Zuoye2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "problemsetid",columnDefinition="bigint")
    private Integer problemsetid;
    @Column(name = "zuoyeid", columnDefinition = "bigint")
    private Integer zuoyeid;

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

    public Integer getZuoyeid() {
        return zuoyeid;
    }

    public void setZuoyeid(Integer zuoyeid) {
        this.zuoyeid = zuoyeid;
    }
}
