package org.just.computer.mathproject.Entity.Students;

import javax.persistence.*;

/**
 * 作业问题表
 */
@Entity(name="HomeworkQuestion")
public class HomeworkQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "homeworkid",columnDefinition="bigint")
    private Integer homeworkid;
    @Column(name = "questionid",columnDefinition="bigint")
    private Integer questionid;

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

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }
}
