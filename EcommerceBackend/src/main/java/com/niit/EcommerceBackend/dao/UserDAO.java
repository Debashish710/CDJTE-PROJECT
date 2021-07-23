package com.niit.EcommerceBackend.dao;

import java.util.List;

import com.niit.EcommerceBackend.model.Address;
import com.niit.EcommerceBackend.model.Cart;
import com.niit.EcommerceBackend.model.User;

public interface UserDAO {
	
	
	// business logic method
	List<User>list();
	
	User get(int userId);
	
	boolean addUser(User user);
	
    User getByEmail(String email);
	
	boolean addAddress(Address address);
	
	Address getByBillingAddress(User user);
	List<Address> listShippingAddress(User user); 
	
	
	///initially addCart then after necessary change update cart
	boolean addCart(Cart cart);
	
	boolean updateCart(Cart cart);

}
