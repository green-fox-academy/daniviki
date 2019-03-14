package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

    private RedditRepo redditRepo;

    @Autowired
    public RedditApplication(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

}
