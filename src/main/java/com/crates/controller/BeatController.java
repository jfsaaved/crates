package com.crates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crates.service.BeatService;

@Controller
public class BeatController {
	
	private BeatService beatService;
	
	@Autowired
	public BeatController(BeatService beatService){
		this.beatService = beatService;
	}

}
