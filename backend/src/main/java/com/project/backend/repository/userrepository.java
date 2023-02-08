package com.project.backend.repository;

import com.project.backend.entity.userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userrepository extends JpaRepository<userentity, Long> {
    Optional<userentity> findById(Long idx);
}
