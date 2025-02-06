package com.example.demo.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardVO {
    private int idx;
    private String title;
    private String contents;
    private int views;
    private LocalDateTime creatAt;
    private String createAccountId;
    private LocalDateTime modifyAt;
    private String modifyAccountId;


    @Override
    public String toString() {
        return "BoardVO{" +
                "idx=" + idx +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", views=" + views +
                ", creatAt=" + creatAt +
                ", createAccountId='" + createAccountId + '\'' +
                ", modifyAt=" + modifyAt +
                ", modifyAccountId='" + modifyAccountId + '\'' +
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

    public LocalDateTime getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(LocalDateTime creatAt) {
        this.creatAt = creatAt;
    }

    public String getCreateAccountId() {
        return createAccountId;
    }

    public void setCreateAccountId(String createAccountId) {
        this.createAccountId = createAccountId;
    }

    public LocalDateTime getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(LocalDateTime modifyAt) {
        this.modifyAt = modifyAt;
    }

    public String getModifyAccountId() {
        return modifyAccountId;
    }

    public void setModifyAccountId(String modifyAccountId) {
        this.modifyAccountId = modifyAccountId;
    }
}
