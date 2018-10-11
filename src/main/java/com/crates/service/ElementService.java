package com.crates.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.crates.repository.ElementRepository;
import com.crates.repository.SampleRepository;

public class ElementService {
	
	private ElementRepository elementRepository;
	
	@Autowired
	public ElementService(ElementRepository elementRepository){
		super();
		this.elementRepository = elementRepository;
	}
	
	

}
