package com.example.whatsnew.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

 @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
     return httpSecurity.csrf().disable()
             .authorizeRequests()
             .antMatchers()
             .permitAll()
             .anyRequest()
             .authenticated();



 }
}

