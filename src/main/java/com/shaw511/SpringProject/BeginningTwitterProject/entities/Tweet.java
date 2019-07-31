package com.shaw511.SpringProject.BeginningTwitterProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Tweet {

    @Id
    private Integer id;
    private String content;


    public Tweet(){}

    public Tweet(String content){
        Random random = new Random();
        this.content = content;
        this.id = new Integer(random.nextInt(10000));
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


}
