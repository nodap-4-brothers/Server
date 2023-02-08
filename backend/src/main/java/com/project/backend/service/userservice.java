package com.project.backend.service;

import com.project.backend.entity.userentity;
import com.project.backend.repository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {
    @Autowired
    private userrepository userrepository;

    public void signup(userentity userentity) {
        userrepository.save(userentity);
    }
}
