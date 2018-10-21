package com.crates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.crates.service.FlipService;
import com.crates.service.ProducerService;

@Controller
public class ProducerController {
	
	private ProducerService producerService;
	
	@Autowired
	public ProducerController(ProducerService producerService){
		this.producerService = producerService;
	}

}
