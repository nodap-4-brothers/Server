package com.project.backend.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@Table(name = "Account")
@EnableJpaRepositories
public class userentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true)
    private Integer idx;

    @Column
    public String email;

    @Column
    public static String password;

}

