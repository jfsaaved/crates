package com.crates.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
public class CratesErrorController implements ErrorController{

	private static final String ERROR_PATH = "/error";
	private static final String ERROR_TEMPLATE = "error";
	
	private final ErrorAttributes errorAttributes;

	@Autowired
	public CratesErrorController(ErrorAttributes errorAttributes) {
		this.errorAttributes = errorAttributes;
	}

	@RequestMapping(ERROR_PATH)
	public String error(Model model,WebRequest webRequest) {
		
		Map<String,Object> error = this.errorAttributes.getErrorAttributes(webRequest, true);
		
		//model.addAttribute("timestamp", error.get("timestamp"));
		//model.addAttribute("message", error.get("message"));
		//model.addAttribute("path", error.get("path"));
		//model.addAttribute("error", error.get("error"));
		
		model.addAttribute("status", error.get("status") + " error");
		
		String description = "";
		if(error.get("status").toString().equals("404"))
			description = "Page not found.";
		
		model.addAttribute("description",description);
		
		return ERROR_TEMPLATE;
	}
	
	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
	
}
