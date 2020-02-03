package org.just.computer.mathproject.Entity.Homework;

import javax.persistence.*;

/**
 * 作业4表
 */
@Entity(name="Zuoye4")
public class Zuoye4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "zuoyeid", columnDefinition = "bigint")
    private Integer zuoyeid;
    @Column(name = "username", columnDefinition = "varchar(255)")
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZuoyeid() {
        return zuoyeid;
    }

    public void setZuoyeid(Integer zuoyeid) {
        this.zuoyeid = zuoyeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
