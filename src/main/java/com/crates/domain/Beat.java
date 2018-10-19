package com.crates.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class Beat {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat ( pattern="yyyy")
	private Date year;
	
	@OneToOne
	private Flip flip;
	
	@OneToOne
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

	public Flip getFlip() {
		return flip;
	}

	public void setFlip(Flip flip) {
		this.flip = flip;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}


}
