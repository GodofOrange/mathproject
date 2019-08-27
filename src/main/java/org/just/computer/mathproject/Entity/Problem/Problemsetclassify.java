package org.just.computer.mathproject.Entity.Problem;

import javax.persistence.*;

@Entity(name="Problemsetclassify")
public class Problemsetclassify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "problemsetid",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer problemsetid;
    @Column(name = "problemclassifyid",columnDefinition="bigint COMMENT '主键，自动生成'")
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
