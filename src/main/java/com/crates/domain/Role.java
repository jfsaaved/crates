package com.crates.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="\"Role\"")
public class Role {
	
	@Id
	@GeneratedValue
    private Long id;
    private String name;
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
