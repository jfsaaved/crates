package com.crates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.crates.service.BeatService;
import com.crates.service.FlipService;

@Controller
public class FlipController {
	
	private FlipService flipService;
	
	@Autowired
	public FlipController(FlipService flipService){
		this.flipService = flipService;
	}


}
