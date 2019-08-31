package org.just.computer.mathproject.Entity.Article;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 文章表
 */
@Entity(name="Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "title",columnDefinition="varchar(32)")
    private String title;
    @Column(name = "content",columnDefinition="longtext")
    private String content;
    @Column(name = "userid",columnDefinition="text")
    private String userid;
    @Column(name = "enabled",columnDefinition="tinyint(1)")
    private Integer enabled;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
