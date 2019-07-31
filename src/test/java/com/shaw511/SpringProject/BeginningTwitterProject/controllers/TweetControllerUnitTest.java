package com.shaw511.SpringProject.BeginningTwitterProject.controllers;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareConcurrentModel;

import static org.junit.Assert.assertEquals;

public class TweetControllerUnitTest {

    @Test
    public void makeTweetController() {
        TweetController controller = new TweetController();
        Model model = new BindingAwareConcurrentModel();
        String result = controller.tweet("This is a test tweet",  model);
        assertEquals("tweet",result);
        assertEquals("This is a test tweet", model.asMap().get("tweet"));

    }



}
