package com.crates.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crates.domain.Sample;
import com.crates.repository.SampleRepository;
import com.crates.service.SampleService;

@RestController
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
	public ResponseEntity<Object> getAllSamples() {
		// This returns a JSON or XML with the users
		
        List<Sample> entities = new ArrayList<Sample>();
        for (Sample n : sampleService.list()) {
            entities.add(n);
        }
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
		//return sampleService.listAllTitleAsString();
	}

}
