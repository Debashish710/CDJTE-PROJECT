package com.niit.EcommerceBackend.test;






import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.model.Category;

public class CategoryTest {

	private static AnnotationConfigApplicationContext ctx;
	private static CategoryDAO categoryDAO;
	private static Category category;
	
@BeforeClass
	public static void init()
	{
		ctx=new AnnotationConfigApplicationContext();
		
		ctx.scan("com.niit.EcommerceBackend");
		
		ctx.refresh();
		
		categoryDAO=(CategoryDAO) ctx.getBean("categoryDAO");
	}
@Ignore
@Test
public  void testAddCategory()
{
	category=new Category();
	
	//category.setId(1);
	category.setName("Japan");
	category.setDescription("konichiwa");
	category.setImageURL("2.jpg");
	
	assertEquals("category added successfully",true,categoryDAO.add(category));
}

@Ignore
@Test
public  void testGetCategory()
{
	category=categoryDAO.get(2);
	
	assertEquals("category is retrieved successfully","Japan",category.getName());
}


@Ignore
@Test
public  void testlistCategory()
{
	category=categoryDAO.get(6);
	
	assertEquals("category is retrieved successfully",6,categoryDAO.lists().size());
}

@Ignore
@Test
public  void testUpdateCategory()
{
	category=categoryDAO.get(3);
	
	//category.setId(1);
	category.setName("New Zealand");
	category.setDescription("kiwi");
	category.setImageURL("3.jpg");
	
	assertEquals("category updated successfully",true,categoryDAO.update(category));
}

@Test
public  void testdeleteCategory()
{
	category=categoryDAO.get(3);
	
	
	assertEquals("category deleted successfully",true,categoryDAO.delete(category));
}


}
