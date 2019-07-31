package com.shaw511.SpringProject.BeginningTwitterProject.controllers;


import com.shaw511.SpringProject.BeginningTwitterProject.entities.Tweet;
import com.shaw511.SpringProject.BeginningTwitterProject.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class TweetRestController {

    @Autowired
    private TweetService tweetService;

    @GetMapping("/tweets")
    public List<Tweet> getAllTweets(){
        return tweetService.getAllTweets();
    }

    @GetMapping("/tweets/{id}")
    public Tweet getTweet(@PathVariable Integer id){
        return tweetService.getTweet(id);
    }


}
