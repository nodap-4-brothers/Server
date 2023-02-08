package com.project.backend.controller;

import com.project.backend.entity.userentity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class usercontroller {

    @PostMapping("/signup")
    private String signup() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String encodedPassword = passwordEncoder.encode(userentity.password);
        userentity.password = encodedPassword;
        return "signup_succeed";
    }
}
