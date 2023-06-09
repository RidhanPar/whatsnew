package com.example.whatsnew.repository;

import com.example.whatsnew.model.Post;
import com.example.whatsnew.model.User;
import com.example.whatsnew.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
   Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}