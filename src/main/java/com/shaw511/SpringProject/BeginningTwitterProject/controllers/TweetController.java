package com.shaw511.SpringProject.BeginningTwitterProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TweetController {

    @GetMapping("/tweet")
    public String tweet(
            @RequestParam(required = false) String text,
            Model model){
        model.addAttribute("tweet", text);
        return "tweet";
    }

}
