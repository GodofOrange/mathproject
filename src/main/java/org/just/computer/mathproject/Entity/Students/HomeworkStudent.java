package org.just.computer.mathproject.Entity.Students;

import javax.persistence.*;

/**
 * 作业学生表
 */
@Entity(name="HomeworkStudent")
public class HomeworkStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "homeworkid",columnDefinition="bigint")
    private Integer homeworkid;
    @Column(name = "studentid",columnDefinition="bigint")
    private Integer studentid;
    @Column(name = "score",columnDefinition="bigint")
    private Integer score;
    @Column(name = "enabled",columnDefinition="tinyint(1)")
    private Integer enabled;
    @Column(name = "peoplenumber",columnDefinition="bigint")
    private Integer peoplenumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(Integer homeworkid) {
        this.homeworkid = homeworkid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
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

    public Integer getPeoplenumber() {
        return peoplenumber;
    }

    public void setPeoplenumber(Integer peoplenumber) {
        this.peoplenumber = peoplenumber;
    }
}
