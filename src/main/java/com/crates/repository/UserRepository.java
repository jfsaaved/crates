package com.crates.repository;

import com.crates.domain.User;

import java.util.List;

import org.springframework.data.repository.*;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
}
