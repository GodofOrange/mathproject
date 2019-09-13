package org.just.computer.mathproject.Entity.Homework;

import javax.persistence.*;

/**
 * 作业3表
 */
@Entity(name="Zuoye3")
public class Zuoye3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "diy", columnDefinition = "varchar(255)")
    private String diy;
    @Column(name = "classifyid",columnDefinition="bigint")
    private Integer classifyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiy() {
        return diy;
    }

    public void setDiy(String diy) {
        this.diy = diy;
    }

    public Integer getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(Integer classifyid) {
        this.classifyid = classifyid;
    }
}
