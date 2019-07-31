package com.shaw511.SpringProject.BeginningTwitterProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Tweet {

    @Id
    private Integer id;
    private String content;
    private String date;


    public Tweet(){}

    public Tweet(String content){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Random random = new Random();
        this.content = content;
        this.id = new Integer(random.nextInt(10000));
        this.date = formatter.format(date);
        System.out.println(date);
    }

    public String getDate() {
        return date;
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
