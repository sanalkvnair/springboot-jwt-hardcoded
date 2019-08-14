package com.mindblaze.springbootapp.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) {
    if ("springboot".equals(username)) {
      return new User(
          "springboot",
          "$2a$10$WD.TfCCwkKpZbqAqudCTjegJq/w9KN7rk0jxPgFaqpSNstA5FKK4S",
          new ArrayList<>());
    }
    throw new UsernameNotFoundException("User not found with username: " + username);
  }
}
