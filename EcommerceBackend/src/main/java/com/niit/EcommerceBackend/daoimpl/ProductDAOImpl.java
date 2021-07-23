package com.niit.EcommerceBackend.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackend.dao.ProductDAO;
import com.niit.EcommerceBackend.model.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Product get(int productId) {

		try {

			return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(productId));
		}

		catch (Exception ex) {

			ex.printStackTrace();
		}

		return null;

	}
	
	
	

	@Override
	public List<Product> lists() {
	return sessionFactory.getCurrentSession().createQuery("FROM Product", Product.class).getResultList();
	}
	
	
	

	@Override
	public boolean add(Product product) {
		try
		{
			
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		
	}
	
	
	@Override
	public boolean update(Product product) {
		try
		{
			
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Product product) {
		try
		{
			product.setActive(false);
			return this.update(product);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	
	

	@Override
	public List<Product> listActiveProducts() 
	{
		String activeProducts="FROM Product where active =: active";
		return sessionFactory.getCurrentSession().createQuery(activeProducts,Product.class).setParameter("active",true).getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		String selectActiveProductsByCategory="FROM Product WHERE active=:active AND categoryId =: categoryId";
		return sessionFactory.getCurrentSession().createQuery(selectActiveProductsByCategory,Product.class)
				.setParameter("active",true)
				.setParameter("categoryId", categoryId).getResultList();
	}

	

	@Override
	public List<Product> getLatestActiveProducts(int count) {
		String latestActiveProducts="FROM Product WHERE active=:active ORDER BY ID";
		
		return sessionFactory.getCurrentSession().createQuery(latestActiveProducts,Product.class).setParameter("active", true).setFirstResult(0).setFirstResult(count).getResultList();
	}




	




	










}
