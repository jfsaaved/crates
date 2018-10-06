package com.crates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crates.domain.Sample;
import com.crates.repository.SampleRepository;
import com.crates.service.SampleService;

@Controller
@RequestMapping(path="/sample")
public class SampleController {
	
	@Autowired
	private SampleService sampleService;

	@GetMapping(path="/add")
	public @ResponseBody String addNewSample (@RequestParam String title, @RequestParam String link, @RequestParam String artist){
		Sample s = new Sample(title, link, artist);
		sampleService.save(s);
		return "Saved";
		
	}
	
	@GetMapping(path="/all")
	public @ResponseBody String getAllSamples() {
		// This returns a JSON or XML with the users
		return sampleService.list().get(0).toString();
	}

}
