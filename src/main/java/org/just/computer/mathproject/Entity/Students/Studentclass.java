package org.just.computer.mathproject.Entity.Students;

import javax.persistence.*;

/**
 * 学生班级表
 */
@Entity(name="Studentclass")
public class Studentclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "userid",columnDefinition="bigint")
    private Integer userid;
    @Column(name = "classid",columnDefinition="bigint")
    private Integer classid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}
