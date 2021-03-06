package org.just.computer.mathproject.Entity.Problem;

import javax.persistence.*;
/**
 * 题目表
 */
@Entity(name="Problemset")
public class Problemset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "title",unique = true,columnDefinition="varchar(32)")
    private String title;
    @Column(name = "level",columnDefinition="varchar(32)")
    private String level;
    @Column(name = "enabled",columnDefinition="tinyint(1)")
    private Integer enabled;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
