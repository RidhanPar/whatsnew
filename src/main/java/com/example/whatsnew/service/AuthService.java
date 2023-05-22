package com.example.whatsnew.service;

import com.example.whatsnew.dto.RegisterRequest;
import com.example.whatsnew.model.User;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class AuthService {

    public void signup(RegisterRequest registerRequest){
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.serpassword(registerRequest.getPassword());
        user.setCreated(Instant.now());
        user.setEnabled(false);}

    }

}
