package com.shaw511.SpringProject.BeginningTwitterProject.controllers;


import com.shaw511.SpringProject.BeginningTwitterProject.entities.Tweet;
import com.shaw511.SpringProject.BeginningTwitterProject.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @GetMapping("/tweet")
    public String tweet(
            @RequestParam(required = false) String text,
            Model model){
        model.addAttribute("tweet", text);
        return "tweet";
    }

    @PostMapping(path = "/tweets")
    public ModelAndView addTweet(@RequestParam String content){
        Tweet newTweet = new Tweet(content);
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
