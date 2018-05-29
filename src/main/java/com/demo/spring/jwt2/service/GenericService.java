package com.demo.spring.jwt2.service;

import com.demo.spring.jwt2.domain.RandomCity;
import com.demo.spring.jwt2.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}

