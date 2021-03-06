package com.recepcoban.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
@Entity(name = "demo_address")
public class Address extends AbstractModel {

	@NotNull
	@NotEmpty(message = "country is required field")
	private String country;

	@NotNull
	@NotEmpty(message = "city is required field")
	private String city;

	@NotNull
	@NotEmpty(message = "zipCode is required field")
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

	@Override
	public String toString() {
		return "Address{" +
				"country='" + country + '\'' +
				", city='" + city + '\'' +
				", zipCode='" + zipCode + '\'' +
				", userId=" + userId +
				'}';
	}

}
