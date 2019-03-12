package com.crates.repository;

import org.springframework.data.repository.CrudRepository;

import com.crates.domain.Role;


public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByRole(String role);
}
