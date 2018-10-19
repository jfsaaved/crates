package com.crates.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="\"Flip\"")
public class Flip {
	
	// Flip ID
	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty
	private String type;

	private String comment;
	
	@ManyToOne
	private Sample sample;
	
	@OneToOne
	private Beat beat;

	public Flip(){
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getComment(){
		return comment;
	}
	
	public void setComments(String comment){
		this.comment = comment;
	}
	
	public Sample getSample(){
		return sample;
	}
	
	public void setSample(Sample sample){
		this.sample = sample;
	}
	
	public Beat getBeat(){
		return beat;
	}
	
	public void setBeat(Beat beat){
		this.beat = beat;
	}
	
}
