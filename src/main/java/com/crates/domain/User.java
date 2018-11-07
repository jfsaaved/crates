package com.crates.domain;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="\"User\"")
public class User {
	

	private Long id;
	private String username;
	private String password;
	private String passwordConfirm;
    private Set<Role> roles;
	
	@ManyToMany
	private Set<Sample> samples;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	public Set<Sample> getSamples() {
		return samples;
	}

	public void setSamples(Set<Sample> samples) {
		this.samples = samples;
	}
	
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
	

}
