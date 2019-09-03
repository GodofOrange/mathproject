package org.just.computer.mathproject.Bean;


public class ExampleLinksBean {
    private Integer ProblemsetId;
    private String title;
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getProblemsetId() {
        return ProblemsetId;
    }

    public void setProblemsetId(Integer problemsetId) {
        ProblemsetId = problemsetId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
