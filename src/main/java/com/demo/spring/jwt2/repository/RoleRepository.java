package com.demo.spring.jwt2.repository;

import com.demo.spring.jwt2.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}