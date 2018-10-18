package com.crates.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="\"Sample\"")
public class Sample {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String link;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String artist;
	
	@OneToMany(targetEntity=Flip.class, mappedBy="sample", fetch=FetchType.EAGER)
	private List<Flip> flips;
	
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
