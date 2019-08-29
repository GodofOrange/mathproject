package org.just.computer.mathproject.Entity.Book;

import javax.persistence.*;

/**
 * 例题评论表
 */
@Entity(name="ExampleComment")
public class ExampleComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;

    @Column(name = "exampleid",columnDefinition="bigint")
    private Integer exampleid;

    @Column(name = "username",columnDefinition="varchar(32)")
    private String username;

    @Column(name = "content",columnDefinition="text")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExampleid() {
        return exampleid;
    }

    public void setExampleid(Integer exampleid) {
        this.exampleid = exampleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
