package com.crates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crates.repository.BeatRepository;

@Service
public class BeatService {
	
	private BeatRepository beatRepository;
	
	@Autowired
	public BeatService(BeatRepository beatRepository){
		super();
		this.beatRepository = beatRepository;
	}

}
