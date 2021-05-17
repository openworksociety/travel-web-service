package com.travel.service.security.impl;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.travel.service.dto.JwtRequest;
import com.travel.service.repository.UserRepository;
import com.travel.service.security.model.UserEntity;

@Service
public class JwtUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder bcryptEncoder;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    // if ("javainuse".equals(username)) {
    // return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
    // new ArrayList<>());
    // } else {
    // throw new UsernameNotFoundException("User not found with username: " + username);
    // }

    UserEntity user = userRepository.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException("User not found with username: " + username);
    }
    return new org.springframework.security.core.userdetails.User(user.getUsername(),
        user.getPassword(), new ArrayList<>());
  }

  public JwtRequest save(JwtRequest user) {
    UserEntity newUser = UserEntity.builder().username(user.getUsername())
        .password(bcryptEncoder.encode(user.getPassword())).build();
    UserEntity savedUser = userRepository.save(newUser);
    return JwtRequest.builder().username(savedUser.getUsername()).password(savedUser.getPassword())
        .build();
  }
}
