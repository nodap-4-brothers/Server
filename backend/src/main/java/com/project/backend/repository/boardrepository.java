package com.project.backend.repository;

import com.project.backend.entity.postentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface boardrepository extends JpaRepository<postentity, Integer> {
}
