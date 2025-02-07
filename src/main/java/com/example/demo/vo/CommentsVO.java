package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommentsVO {
    private Integer idx;
    private Integer boardIdx;
    private Integer grade;
    private String comments;
    private String createAccountId;
    private LocalDateTime createdAt;
    private String modifyAccountId;
    private LocalDateTime modifyAt;

    @Override
    public String toString() {
        return "CommentsVO{" +
                "idx=" + idx +
                ", boardIdx=" + boardIdx +
                ", grade=" + grade +
                ", comments='" + comments + '\'' +
                ", createAccountId='" + createAccountId + '\'' +
                ", createdAt=" + createdAt +
                ", modifyAccountId='" + modifyAccountId + '\'' +
                ", modifyAt=" + modifyAt +
                '}';
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getBoardIdx() {
        return boardIdx;
    }

    public void setBoardIdx(Integer boardIdx) {
        this.boardIdx = boardIdx;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifyAccountId() {
        return modifyAccountId;
    }

    public void setModifyAccountId(String modifyAccountId) {
        this.modifyAccountId = modifyAccountId;
    }

    public LocalDateTime getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(LocalDateTime modifyAt) {
        this.modifyAt = modifyAt;
    }
}
