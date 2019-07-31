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
    public Tweet getTweet(@PathVariable String id){
        return tweetService.getTweet(Integer.parseInt(id));
    }

    @PostMapping(path = "/tweets")
    public ModelAndView addTweet(@RequestParam String content, @RequestParam String id){
        Tweet newTweet = new Tweet(content, Integer.parseInt(id));
        tweetService.addTweet(newTweet);

        return new ModelAndView("redirect:/");

    }

    @GetMapping("/")
    public ModelAndView showTweets(){
        List<Tweet> tweets = tweetService.getAllTweets();
        Collections.reverse(tweets);


        ModelAndView model = new ModelAndView("index");

        model.addObject("tweets", tweets);

        return model;

    }
}
