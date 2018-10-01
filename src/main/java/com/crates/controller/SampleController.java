package com.crates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crates.domain.Sample;
import com.crates.repository.SampleRepository;

@Controller
@RequestMapping(path="/sample")
public class SampleController {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewSample (@RequestParam String title, @RequestParam String link, @RequestParam String artist){
		Sample s = new Sample(title, link, artist);
		sampleRepository.save(s);
		return "Saved";
		
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Sample> getAllSamples() {
		// This returns a JSON or XML with the users
		return sampleRepository.findAll();
	}

}
