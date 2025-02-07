package com.example.demo.dto;

import lombok.Data;

@Data
public class CommentsDto {

    private Integer idx;
    private Integer grade;
    private String comments;
    private String createAccountId;

    @Override
    public String toString() {
        return "commentsDto{" +
                "idx=" + idx +
                ", grade=" + grade +
                ", comments='" + comments + '\'' +
                ", createAccountId='" + createAccountId + '\'' +
                '}';
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCreateAccountId() {
        return createAccountId;
    }

    public void setCreateAccountId(String createAccountId) {
        this.createAccountId = createAccountId;
    }
}
