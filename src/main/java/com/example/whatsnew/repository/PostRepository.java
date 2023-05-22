package com.example.whatsnew.repository;

import com.example.whatsnew.model.Post;
import com.example.whatsnew.model.Subreddit;
import com.example.whatsnew.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}