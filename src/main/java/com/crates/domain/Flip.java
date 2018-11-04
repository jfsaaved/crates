package com.crates.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@JoinColumn(name = "sample_id")
	private Sample sample;
	
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
	
}
