package com.niit.ecommercefrontend.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.niit.EcommerceBackend.model.Category;

public class CategoryValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Category.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Category category=(Category)target;
		
		if(category.getFile()==null||category.getFile().getOriginalFilename().equals(""))
		{
			errors.rejectValue("file",null,"Please Select a File to Uplaod!!");
		}
		
		if(!(category.getFile().getContentType().equals("image/jpg"))|| category.getFile().getContentType().equals("image/jpeg")||
				category.getFile().getContentType().equals("image/png")||
				category.getFile().getContentType().equals("image/gif"))
    {
			errors.rejectValue("file", null,"Please Select a Valid Image Format!!!");
			return;
	}
		
	}

}
