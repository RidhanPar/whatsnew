package com.example.whatsnew.repository;

import com.example.whatsnew.model.Post;
import com.example.whatsnew.model.User;
import com.example.whatsnew.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
