package com.danielkim.soundrecorder.Model;

public class Comment {

    String commentor;
    String commentor_id;
    String comment;

    public Comment(String commentor, String commentor_id, String comment) {
        this.commentor = commentor;
        this.commentor_id = commentor_id;
        this.comment = comment;
    }

    public Comment() {

    }

    public String getCommentor() {
        return commentor;
    }

    public void setCommentor(String commentor) {
        this.commentor = commentor;
    }

    public String getCommentor_id() {
        return commentor_id;
    }

    public void setCommentor_id(String commentor_id) {
        this.commentor_id = commentor_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
