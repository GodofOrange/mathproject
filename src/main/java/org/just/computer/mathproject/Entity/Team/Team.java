package org.just.computer.mathproject.Entity.Team;

import javax.persistence.*;

/**
 * 团队表
 */
@Entity(name="Team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "teamname",columnDefinition="varchar(32)")
    private String teamname;
    @Column(name = "contestid",columnDefinition="bigint")
    private Integer contestid;
    @Column(name = "teacherid",columnDefinition="bigint")
    private Integer teacherid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Integer getContestid() {
        return contestid;
    }

    public void setContestid(Integer contestid) {
        this.contestid = contestid;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }
}
