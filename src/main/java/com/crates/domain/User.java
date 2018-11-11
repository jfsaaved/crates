package com.crates.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="\"User\"")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private String passwordConfirm;
	
	@OneToMany(targetEntity=Flip.class, mappedBy="user", fetch=FetchType.EAGER)
	private List<Flip> flips;
	
	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	

}
