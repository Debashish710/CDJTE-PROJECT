package com.niit.EcommerceBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.EcommerceBackend.dao.ProductDAO;
import com.niit.EcommerceBackend.model.Product;

public class ProductTest {

	private static AnnotationConfigApplicationContext ctx;

	private static ProductDAO productDAO;

	private static Product product;

	@BeforeClass
	public static void init() {
		ctx = new AnnotationConfigApplicationContext();

		ctx.scan("com.niit.EcommerceBackend");

		ctx.refresh();

		productDAO = (ProductDAO) ctx.getBean("productDAO");
	}

	
	@Test
	public void testAddProduct() {
		product = new Product();

		product.setName("Bhharat");
		product.setBrand("India");
		product.setDescription("This is the latest model");
		product.setUnitPrice("100000");
		product.setCategoryId(1);
		product.setActive(true);
		product.setSupplierId(1);

		assertEquals("Product Added Successfully", true, productDAO.add(product));

	}

	@Ignore
	@Test
	public void testGetProduct() 
	{
		product = productDAO.get(1);
		assertEquals("Product Retrieved Successfully", "Iphone 12", product.getName());

	}
	
	@Ignore
	@Test
	public void testListProduct() 
	{
		product = productDAO.get(2);
		assertEquals("data Retrieved", 3, productDAO.lists().size());

	}
	
	@Ignore
	@Test
	public void testupdateProduct() 
	{
		product = productDAO.get(4);
		
		product=new Product();
		product.setCode("1000");
		product.setName("Iphone 12");
		product.setBrand("Iphone");
		product.setDescription("This is the latest model");
		product.setUnitPrice("100000");
		product.setCategoryId(3);
		product.setActive(true);
		product.setSupplierId(1);

		assertEquals("Product updated Successfully", true, productDAO.update(product));

	}
	
	@Ignore
	@Test
	public void testdeleteProduct() 
	{
		product = productDAO.get(4);
		assertEquals("Product deleted successfully", true, productDAO.delete(product));

	}
	

	@Ignore
	@Test
	public void testListActiveProducts() {
		assertEquals("Active Product Fetched Successfully",6, productDAO.listActiveProducts().size());
	}
	

	@Ignore
	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Active Product By Category Fetched Successfully",6,productDAO.listActiveProductsByCategory(4).size());
	}
	
	@Ignore
	@Test
	public void testgetLatestActiveProducts() {
		assertEquals("latest Products", 0, productDAO.getLatestActiveProducts(13).size());
	}

}
