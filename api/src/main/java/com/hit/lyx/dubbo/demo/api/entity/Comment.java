package com.hit.lyx.dubbo.demo.api.entity;

public class Comment {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Comment(String content) {
        this.content = content;
    }

    private String content;
}
