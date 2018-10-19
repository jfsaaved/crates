package com.crates.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="\"Sample\"")
public class Sample {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat ( pattern="yyyy")
	private Date year;
	
	private String link;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String artist;
	
	@OneToMany(targetEntity=Flip.class, mappedBy="sample", fetch=FetchType.EAGER)
	private List<Flip> flips;
	
	public Sample(){

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
	
	public List<Flip> getFlips(){
		return flips;
	}
	
	public void setFlips(List<Flip> flips){
		this.flips = flips;
	}
	
	public void addFlip(Flip flip){
		flips.add(flip);
	}


}
