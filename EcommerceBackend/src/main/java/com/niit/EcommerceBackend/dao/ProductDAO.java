package com.niit.EcommerceBackend.dao;

import java.util.List;
import com.niit.EcommerceBackend.model.Product;



public interface ProductDAO {
	

	// business logic method
	List<Product> lists();

	Product get(int productId);

	boolean add(Product product);
	
	boolean update(Product product);
	
	boolean delete(Product product);
	
	//extra functionalities
	
	List<Product>listActiveProducts();
	List<Product>listActiveProductsByCategory(int categoryId);
	List<Product>getLatestActiveProducts(int count);
	

	
	

}
