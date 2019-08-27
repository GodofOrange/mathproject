package org.just.computer.mathproject.Entity.Problem;

import javax.persistence.*;
/**
 * 题目主体表
 */
@Entity(name="Problembody")
public class Problembody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "problemsetid",columnDefinition="bigint ",unique = true)
    private Integer problemsetid;
    @Column(name = "body",columnDefinition="longtext")
    private String body;
    @Column(name = "answer",columnDefinition="text")
    private String answer;
    @Column(name = "kind",columnDefinition = "varchar(32)")
    private String kind;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
