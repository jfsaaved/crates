package com.crates.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crates.domain.Sample;
import com.crates.repository.SampleRepository;
import com.crates.service.SampleService;

@Controller
public class SampleController {
	
	private SampleService sampleService;

	@Autowired
	public SampleController(SampleService sampleService){
		super();
		this.sampleService = sampleService;
	}
	
	@RequestMapping("/samples")
	public String list(Model model) {
		model.addAttribute("samples", sampleService.list());
		return "sample/list";
	}
	
	
}
