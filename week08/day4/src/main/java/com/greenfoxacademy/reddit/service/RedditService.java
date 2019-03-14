package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditService {

    private RedditRepo redditRepo;

    @Autowired
    public RedditService(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }

}
