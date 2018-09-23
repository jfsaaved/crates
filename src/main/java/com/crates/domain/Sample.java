package com.crates.domain;

import javax.persistence.GeneratedValue;

public class Sample {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String link;
	
	public Sample(){
		this.link = "";
	}

}
