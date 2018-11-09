package com.crates.repository;

import com.crates.domain.User;
import org.springframework.data.repository.*;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
