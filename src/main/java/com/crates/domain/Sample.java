package com.crates.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Sample {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String link;
	private String title;
	private String artist;
	
	public Sample(){
		this.setLink("");
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
