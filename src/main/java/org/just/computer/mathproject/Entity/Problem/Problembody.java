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
    @Column(name = "standard",columnDefinition = "text")
    private String standard;
    @Column(name = "answer",columnDefinition="longtext")
    private String answer;
    //1为选填 2为证明
    @Column(name = "kind",columnDefinition = "varchar(32)")
    private String kind;
    @Column(name = "uploadUsername",columnDefinition = "varchar(255)")
    private String uploadUsername;

    public String getUploadUsername() {
        return uploadUsername;
    }

    public void setUploadUsername(String uploadUsername) {
        this.uploadUsername = uploadUsername;
    }

    public Integer getId() {
        return id;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
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
