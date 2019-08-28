package org.just.computer.mathproject.Entity.Comment;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 评论回复表
 */
@Entity(name="CommentReply")
public class CommentReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "content",columnDefinition="longtext")
    private String content;
    @Column(name = "username",columnDefinition="varchar(32)")
    private String username;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    @Column(name = "problemcommentid",columnDefinition="bigint")
    private Integer problemcommentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getProblemcommentid() {
        return problemcommentid;
    }

    public void setProblemcommentid(Integer problemcommentid) {
        this.problemcommentid = problemcommentid;
    }
}
