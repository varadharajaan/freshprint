package com.freshprint;


import com.freshprint.model.User;
import com.freshprint.repository.RoleRepository;
import com.freshprint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Varadharajan
 */
@Component
@Transactional
public class DataInitializerImpl {


    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public void initData() {

        User user = new User();
        user.setEmail("aaabbcc@gmail.com");
        user.setFirstname("varadha");
        user.setLastname("rajan");
        user.setPassword("password");
        user.setUsername("varadharajan");
        user.setRoles(null);

        userRepository.save(user);

        List<User> users = userRepository.findAll();
        users.forEach(User::getId);
    }


}
