package org.just.computer.mathproject.Entity.users;

import javax.persistence.*;


@Entity(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(columnDefinition="varchar(255)")
    private String username;
    @Column(columnDefinition="varchar(255)")
    private String password;
    @Column(columnDefinition="tinyint(1) default 1")
    private Boolean enabled;
    @Column(columnDefinition="tinyint(1) default 0")
    private Boolean locked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}
