package com.crates.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class Sample {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private @Getter @Setter String link;
	private @Getter @Setter String title;
	private @Getter @Setter String artist;
	
	public Sample(){
		this.link = "";
		this.artist = "";
		this.title = "";
	}


}
