package com.project.backend.service;

import com.project.backend.entity.postentity;
import com.project.backend.repository.boardrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class boardservice {
    @Autowired
    private boardrepository boardrepository;

    public void write(postentity boardentity) {
        boardrepository.save(boardentity);
    }
}
