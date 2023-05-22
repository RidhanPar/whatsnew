package com.example.whatsnew.repository;

import com.example.whatsnew.model.Comment;
import com.example.whatsnew.model.Post;
import com.example.whatsnew.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}