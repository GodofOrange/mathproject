package org.just.computer.mathproject.Entity;

import javax.persistence.*;

/**
 * 用户信息表
 */
@Entity(name = "UserInformation")
public class UserInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
    private Integer id;
    @Column(name = "userid",unique = true,columnDefinition="bigint")
    private Integer userid;
    @Column(name = "img",columnDefinition="text")
    private String img;
    @Column(name = "signature",columnDefinition="varchar(255)")
    private String signature;
    @Column(name = "QQ",columnDefinition = "varchar(255)")
    private String QQ;
    @Column(name = "iphone",columnDefinition = "varchar(255)")
    private String iphone;
    @Column(name = "email",columnDefinition = "varchar(255)")
    private String email;
    @Column(name = "grade",columnDefinition = "varchar(255)")
    private String grade;
    @Column(name = "major",columnDefinition = "varchar(255)")
    private String major;
    @Column(name = "university",columnDefinition = "varchar(255)")
    private String university;
    @Column(name = "college",columnDefinition = "varchar(255)")
    private String college;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
