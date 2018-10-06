package com.crates.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crates.domain.Sample;
import com.crates.repository.*;

@Service
public class SampleService {

	private SampleRepository sampleRepositry;
	
	@Autowired
	public SampleService(SampleRepository sampleRepository){
		super();
		this.sampleRepositry = sampleRepository;
	}
	
	public List<Sample> list() {
		return sampleRepositry.findAllByOrderByTitleAsc();
	}
	
	public Sample save(Sample sample){
		return this.sampleRepositry.save(sample);
	}
	
}
