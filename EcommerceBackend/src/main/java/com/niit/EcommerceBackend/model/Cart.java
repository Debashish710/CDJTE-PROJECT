package com.niit.EcommerceBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	private int user_id;
	
	private double grand_total;
	
	private int cart_line;
	
	
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

	public double getGrand_total() {
		return grand_total;
	}

	public void setGrand_total(double grand_total) {
		this.grand_total = grand_total;
	}

	public int getCart_line() {
		return cart_line;
	}

	public void setCart_line(int cart_line) {
		this.cart_line = cart_line;
	}

	
	//toString method
	@Override
	public String toString() {
		return "Cart [id=" + id + ", user_id=" + user_id + ", grand_total=" + grand_total + ", cart_line=" + cart_line
				+ "]";
	}
	
		

}
