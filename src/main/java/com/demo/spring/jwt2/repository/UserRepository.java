package com.demo.spring.jwt2.repository;

import com.demo.spring.jwt2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}