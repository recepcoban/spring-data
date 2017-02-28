package com.recepcoban.entity;

import javax.persistence.Entity;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
@Entity(name = "demo_address")
public class Address extends AbstractModel {

	private String country;
	private String city;
	private String zipCode;
	private Long userId;

	public Address() {
	}

	public Address(String country, String city, String zipCode) {
		super();
		this.country = country;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
