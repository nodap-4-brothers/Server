package com.project.backend.controller;

import com.project.backend.entity.postentity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class boardcontroller {

    @PostMapping("/")
    private String Homepage(){
        System.out.println(postentity.title);
        return "Hello World!";
    }


}
