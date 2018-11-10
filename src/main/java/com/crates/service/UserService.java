package com.crates.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.crates.repository.RoleRepository;
import com.crates.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

}
