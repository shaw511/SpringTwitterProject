package com.shaw511.SpringProject.BeginningTwitterProject.controllers;

import com.shaw511.SpringProject.BeginningTwitterProject.entities.Tweet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TweetRestControllerTest {
    @Autowired
    private TestRestTemplate template;

    @Test
    public void tweetNoBody(){
        ResponseEntity<Tweet> entity = template.getForEntity("/tweets", Tweet.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON_UTF8, entity.getHeaders().getContentType());
        Tweet response = entity.getBody();
        assertEquals("Empty tweet", response.getContent());
    }

    @Test
    public void tweetWithbody(){
        Tweet response = template.getForObject("/tweets?tweet=Tweet", Tweet.class);
        assertEquals("Tweet", response.getContent());
    }
}
