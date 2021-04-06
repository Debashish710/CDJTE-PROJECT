package com.niit.ecommercefrontend.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.niit.EcommerceBackend.model.Product;

public class ProductValidator implements Validator 
{

	@Override
	public boolean supports(Class<?> clazz) 
	{
		
		return Product.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors)
	{
		
		Product product=(Product)target;
		
		if(product.getFile() == null || product.getFile().getOriginalFilename().equals(""))
		{
			
			errors.rejectValue("file",null,"Please Select a File to Upload!!!");
			return;
		}
		
		
		if(! (product.getFile().getContentType().equals("image/jpg")||
			  product.getFile().getContentType().equals("image/jpeg")||
			  product.getFile().getContentType().equals("image/png")||
			  product.getFile().getContentType().equals("image/gif")))
		{
			errors.rejectValue("file",null,"Please Select  a Valid Image Format!!");
			return;
		}

	}

}
