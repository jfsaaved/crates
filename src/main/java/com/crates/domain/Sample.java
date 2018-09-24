package com.crates.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Sample {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String link;
	
	public Sample(){
		this.link = "";
	}

}
