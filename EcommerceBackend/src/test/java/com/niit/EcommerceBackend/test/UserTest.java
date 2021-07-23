package com.niit.EcommerceBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.EcommerceBackend.dao.UserDAO;
import com.niit.EcommerceBackend.model.User;

public class UserTest {
	
	private static AnnotationConfigApplicationContext ctx;
	private static UserDAO userDAO;
	private static User user;
	
	@BeforeClass
	public static void init() {
		ctx =new AnnotationConfigApplicationContext();

		ctx.scan("com.niit.EcommerceBackend");

		ctx.refresh();
		
		userDAO= (UserDAO) ctx.getBean("userDAO");
	}

	@Test
	public void testAddUser()
	{
		user=new User();
		
		user.setFirst_name("Ashok");
		user.setLast_name("Kumar");
		user.setRole("Single user");
		user.setEmail("kumarashok@gmail.com");
		user.setContact_number("9977445566");
		user.setEnabled(true);
		user.setId(1);
		
		assertEquals("User Added Successfully", true, userDAO.addUser(user));
		
	}
	
	
}
