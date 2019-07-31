package com.shaw511.SpringProject.BeginningTwitterProject.service;


import com.shaw511.SpringProject.BeginningTwitterProject.entities.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TweetService {
    private List<Tweet> tweets = new ArrayList<>(Arrays.asList(
            new Tweet("This is a tweet", 1),
                new Tweet("This is another tweet", 2),
                new Tweet("Hello my name is Nathan Shaw", 3)));

    public List<Tweet> getAllTweets(){
        return tweets;
    }

    public Tweet getTweet(int id){
        for(Tweet tweet : tweets){
            if (tweet.getId() == id) {
                return tweet;
            }
        }
        return null;
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }
}
