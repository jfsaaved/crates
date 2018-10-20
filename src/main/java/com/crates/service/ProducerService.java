package com.crates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crates.repository.ProducerRepository;

@Service
public class ProducerService {

	private ProducerRepository producerRepository;
	
	@Autowired
	public ProducerService(ProducerRepository producerRepository){
		super();
		this.producerRepository = producerRepository;
	}
	
}
