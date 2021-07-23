package com.niit.EcommerceBackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.EcommerceBackend.dao.UserDAO;
import com.niit.EcommerceBackend.model.Address;
import com.niit.EcommerceBackend.model.Cart;
import com.niit.EcommerceBackend.model.User;

public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory  sessionFactory;
	
	

	
	@Override
	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("FROM User",User.class).getResultList();
	}


	@Override
	public User get(int userId) {
		try {
			return sessionFactory.getCurrentSession().get(User.class, Integer.valueOf(userId));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	
	
	
	@Override
	public boolean addUser(User user) {
		try
		{
			
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	

	@Override
	public User getByEmail(String email) {
		try 
		{

			return sessionFactory.getCurrentSession().get(User.class, String.valueOf(email));
		}

		catch (Exception ex) 
		{

			ex.printStackTrace();
		}

		return null;
	}
	

	@Override
	public boolean addAddress(Address address) {
		try
		{
			
			sessionFactory.getCurrentSession().persist(address);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	

	@Override
	public Address getByBillingAddress(User user) {
		
		String selectQuery = "FROM Address WHERE user = :user AND billing = :billing";

		try{
			return sessionFactory.getCurrentSession()
					.createQuery(selectQuery,Address.class)
					.setParameter("user", user)
					.setParameter("billing",true)
					.getSingleResult();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		
	}
	

	@Override
	public List<Address> listShippingAddress(User user) {
		
		String selectQuery = "FROM Address WHERE user = :user AND shipping = :shipping";

		try{
			return sessionFactory.getCurrentSession()
					.createQuery(selectQuery,Address.class)
					.setParameter("user", user)
					.setParameter("shipping",true)
					.getResultList();
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}	
		
	}
	
	
	@Override
	public boolean addCart(Cart cart) {
		try
		{
			
			sessionFactory.getCurrentSession().persist(cart);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	
	

	@Override
	public boolean updateCart(Cart cart) {
		try
		{
			
			sessionFactory.getCurrentSession().update(cart);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}


	

	

}
