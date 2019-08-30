package org.just.computer.mathproject.Entity.Book;

import javax.persistence.*;

/**
 * 例题表
 */
@Entity(name="Example")
public class Example {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;

    @Column(name = "chapterid",columnDefinition="bigint")
    private Integer chapterid;

    @Column(name = "title",columnDefinition="varchar(32)")
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
