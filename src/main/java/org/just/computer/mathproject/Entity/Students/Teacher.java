package org.just.computer.mathproject.Entity.Students;

import javax.persistence.*;

/**
 * 老师表
 */
@Entity(name="Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "userid",unique = true,columnDefinition="bigint")
    private Integer userid;
    @Column(name = "vip",columnDefinition="tinyint(1)")
    private Integer vip;

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

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }
}
