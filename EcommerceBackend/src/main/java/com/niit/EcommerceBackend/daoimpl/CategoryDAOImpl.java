package com.niit.EcommerceBackend.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	
	
	@Override
	public List<Category> lists() 
	{
		String listCategory="FROM Category where active=: active";
		Query query= sessionFactory.getCurrentSession().createQuery(listCategory);
		query.setParameter("active", true);
		return query.getResultList();
	}


	@Override
	public Category get(int id)
	{
		
		return sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
	}


	@Override
	public boolean add(Category category) 
	{
	try
	{
		
		sessionFactory.getCurrentSession().persist(category);
		return true;
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		return false;
	}
	
	}


	@Override
	public boolean update(Category category) {
		try
		{
			
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try
		{
			
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

}

