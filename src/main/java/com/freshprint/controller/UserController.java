package com.freshprint.controller;


import com.freshprint.model.User;
import com.freshprint.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("freshprint/usermanagement/v1")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<?>  createUser(@RequestParam @Valid final User user) {

        return new ResponseEntity<>(userService.createUser(user), HttpStatus.ACCEPTED);
    }

    @PostMapping("/validate")
    public ResponseEntity<?>  ValidateUser(@RequestParam @Valid final User user) {

        return new ResponseEntity<>(userService.createUser(user), HttpStatus.ACCEPTED);
    }


}
