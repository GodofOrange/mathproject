package org.just.computer.mathproject.Entity.Book;

import javax.persistence.*;

/**
 * 例题主体表
 */
@Entity(name="ExampleBody")
public class ExampleBody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;

    @Column(name = "exampleid",columnDefinition="bigint")
    private Integer exampleid;

    @Column(name = "body",columnDefinition="longtext")
    private String body;

    @Column(name = "answer",columnDefinition="longtext")
    private String answer;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
