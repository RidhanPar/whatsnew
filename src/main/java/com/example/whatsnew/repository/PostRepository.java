package com.example.whatsnew.repository;

import com.example.whatsnew.model.Post;
import com.example.whatsnew.model.Subreddit;
import com.example.whatsnew.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}