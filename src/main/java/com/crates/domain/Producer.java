package com.crates.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="\"Producer\"")
public class Producer {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String name;
	
	@OneToMany(targetEntity=Beat.class, mappedBy="producer", fetch=FetchType.EAGER)
	private List<Beat> beats;
	
	public Producer(){
		
	}
	
	public Long getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public List<Beat> getBeats(){
		return beats;
	}
	
	public void setBeats(List<Beat> beats){
		this.beats = beats;
	}
	
	public void addBeat(Beat beat){
		beats.add(beat);
	}

}
