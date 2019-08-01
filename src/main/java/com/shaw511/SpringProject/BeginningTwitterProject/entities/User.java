package com.shaw511.SpringProject.BeginningTwitterProject.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String username;
    private String password;  // needs to be changed to a hash but that can be worked on later;
    private String bio;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
