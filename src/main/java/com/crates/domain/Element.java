package com.crates.domain;

import java.util.List;

public class Element {
	
	private String name;
	private List<String> alternatives;
	
	public Element(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAlternatives() {
		return alternatives;
	}

	public void setAlternatives(List<String> alternatives) {
		this.alternatives = alternatives;
	}
	

	
}
