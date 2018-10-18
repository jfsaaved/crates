package com.crates.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Beat {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	private Flip flip;

}
