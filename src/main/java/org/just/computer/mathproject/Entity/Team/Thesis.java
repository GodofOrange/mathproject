package org.just.computer.mathproject.Entity.Team;

import javax.persistence.*;

/**
 * 论文表
 */
@Entity(name="Thesis")
public class Thesis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "contestid",columnDefinition="bigint")
    private Integer contestid;
    @Column(name = "userid",columnDefinition="bigint")
    private Integer userid;
    @Column(name = "title",columnDefinition="varchar(32)")
    private String title;
    @Column(name = "body",columnDefinition="longtext")
    private String body;
    @Column(name = "score",columnDefinition="bigint")
    private Integer score;
    @Column(name = "enabled",columnDefinition="tinyint(1)")
    private Integer enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContestid() {
        return contestid;
    }

    public void setContestid(Integer contestid) {
        this.contestid = contestid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
