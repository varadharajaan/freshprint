package com.freshprint.services;

import com.freshprint.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User createUser(User user);

    boolean validateUser(User user);
}
