package org.just.computer.mathproject.Entity.Book;

import javax.persistence.*;

/**
 * 章节表
 */
@Entity(name="Chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;

    @Column(name = "bookid",columnDefinition="bigint")
    private Integer bookid;

    @Column(name = "title",columnDefinition="varchar(32)")
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
