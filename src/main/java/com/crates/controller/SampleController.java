package com.crates.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping("/samples/create")
	public String create(Model model){
		model.addAttribute("sample", new Sample());
		model.addAttribute("samples", sampleService.list());
		return "sample/create";
	}	
	
	@RequestMapping("/samples/{id}")
	public String view(@PathVariable Long id, Model model){
		model.addAttribute("sample", sampleService.get(id));
		return "sample/view";
	}
	
	@RequestMapping( value = "/samples/save", method = RequestMethod.POST )
	public String save(@Valid Sample sample, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("samples", sampleService.list());
			return "sample/create";
		} else {
			Sample savedSample = sampleService.save(sample);
			return "redirect:/samples/" + savedSample.getId();
		}
	}
	
	@RequestMapping("/samples")
	public String list(Model model) {
		model.addAttribute("samples", sampleService.list());
		return "sample/list";
	}
	
	
}
