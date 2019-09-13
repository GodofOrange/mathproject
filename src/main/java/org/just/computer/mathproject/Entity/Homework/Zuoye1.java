package org.just.computer.mathproject.Entity.Homework;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 作业1表
 */
@Entity(name="Zuoye1")
public class Zuoye1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "classid",columnDefinition="bigint")
    private Integer classid;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date datatime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }
}
