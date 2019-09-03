package org.just.computer.mathproject.Entity.Book;

import javax.persistence.*;

@Entity(name="ExampleLinks")
public class ExampleLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "exampleid",columnDefinition="bigint")
    private Integer exampleid;
    @Column(name = "problemsetid",columnDefinition="bigint")
    private Integer problemsetid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExampleid() {
        return exampleid;
    }

    public void setExampleid(Integer exampleid) {
        this.exampleid = exampleid;
    }

    public Integer getProblemsetid() {
        return problemsetid;
    }

    public void setProblemsetid(Integer problemsetid) {
        this.problemsetid = problemsetid;
    }
}
