package com.thinkconstructive.post_service;

public class post {
    private String postId;
    private String description;

    public post(String postId, String description) {
        this.postId = postId;
        this.description = description;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
