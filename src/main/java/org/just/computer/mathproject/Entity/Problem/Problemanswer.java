package org.just.computer.mathproject.Entity.Problem;

import javax.persistence.*;

/**
 * 提交答案表
 */
@Entity(name="Problemanswer")
public class Problemanswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "problemsetid",columnDefinition="bigint")
    private Integer problemsetid;
    @Column(name = "score",columnDefinition="bigint")
    private Integer score;
    @Column(name = "body",columnDefinition="longtext")
    private String body;

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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
