package com.demo.spring.jwt2.repository;

import com.demo.spring.jwt2.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}