package com.crates.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="\"Beat\"")
public class Beat {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat ( pattern="yyyy")
	private Date year;
	
	@OneToMany(targetEntity=Flip.class, mappedBy="beat", fetch=FetchType.EAGER)
	private List<Flip> flips;
	
	@ManyToOne
	private Producer producer;
	
	public Beat(){
		
	}
	
	public Long getId() {
		return id;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public List<Flip> getFlip() {
		return flips;
	}

	public void setFlip(List<Flip> flips) {
		this.flips = flips;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}


}
