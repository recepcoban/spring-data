package com.recepcoban.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@Entity(name = "demo_user")
public class User extends AbstractModel {

	private String firstname;
	private String lastname;
	private String role;
	
	@OneToMany
	private List<Address> addresses;
	
	public User() {
	}

	public User(String firstname, String lastname, String role) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
