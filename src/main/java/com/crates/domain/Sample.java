package com.crates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Sample {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String link;
	private String title;
	private String artist;
	
	public Sample(){
		this.setLink("");
		this.setArtist("");
		this.title = "";
	}
	
	public Sample(String link, String title, String artist){
		this.setLink(link);
		this.title = title;
		this.setArtist(artist);
	}
	
	public String getTitle(){
		return title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}


}
