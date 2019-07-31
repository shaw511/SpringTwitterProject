package com.shaw511.SpringProject.BeginningTwitterProject.service;


import com.shaw511.SpringProject.BeginningTwitterProject.entities.Tweet;
import com.shaw511.SpringProject.BeginningTwitterProject.entities.TweetRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TweetService {

    @Autowired
    private TweetRespository tweetRespository;



    public List<Tweet> getAllTweets(){
        List<Tweet> tweets = new ArrayList<>();
        tweetRespository.findAll().forEach(tweets::add);
        return tweets;
    }

    public Tweet getTweet(Integer id){
        return tweetRespository.findById(id).get();
    }

    public void addTweet(Tweet tweet) {
        //tweets.add(tweet);

        tweetRespository.save(tweet);
    }
}
