package com.shaw511.SpringProject.BeginningTwitterProject.entities;


public class Tweet {

    private String content;
    private int id;

    public Tweet(){}

    public Tweet(String content, int id){
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
