package com.example.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDetailDto {
    private int idx;
    private String title;
    private String contents;
    private int views;
    private String createAccountId;
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "BoardDetailDto{" +
                "idx=" + idx +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", views=" + views +
                ", createAccountId='" + createAccountId + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
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
}
