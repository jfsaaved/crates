package com.crates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crates.repository.FlipRepository;

@Service
public class FlipService {
	
	private FlipRepository flipRepository;

	@Autowired
	public FlipService(FlipRepository flipRepositry){
		super();
		this.flipRepository = flipRepository;
	}
	
}
