package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Reddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface RedditRepo extends JpaRepository<Reddit, Long> {
}
