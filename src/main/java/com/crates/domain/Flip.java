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

	private String comments;
	
	@ManyToOne
	private Sample sample;

}
