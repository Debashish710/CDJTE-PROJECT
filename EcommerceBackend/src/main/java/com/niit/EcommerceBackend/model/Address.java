package com.niit.EcommerceBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	private int user_id;
	
	private String address_line_one;
	
	private String address_line_two;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String postal_code;
	
	private String shipping;
	
	private String billing;
	
	//setter and getter method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getAddress_line_one() {
		return address_line_one;
	}

	public void setAddress_line_one(String address_line_one) {
		this.address_line_one = address_line_one;
	}

	public String getAddress_line_two() {
		return address_line_two;
	}

	public void setAddress_line_two(String address_line_two) {
		this.address_line_two = address_line_two;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}
	
	
	//toString method

	@Override
	public String toString() {
		return "Address [id=" + id + ", user_id=" + user_id + ", address_line_one=" + address_line_one
				+ ", address_line_two=" + address_line_two + ", city=" + city + ", state=" + state + ", country="
				+ country + ", postal_code=" + postal_code + ", shipping=" + shipping + ", billing=" + billing + "]";
	}
	
	
}
