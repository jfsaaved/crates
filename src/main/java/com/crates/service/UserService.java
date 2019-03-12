package com.crates.service;

import org.springframework.stereotype.Service;

import com.crates.domain.User;
import com.crates.repository.RoleRepository;
import com.crates.repository.UserRepository;

public interface UserService {
	
	 public User findUserByEmail(String email);
	 public void saveUser(User user);
}
