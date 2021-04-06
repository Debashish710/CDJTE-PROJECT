package com.niit.ecommercefrontend.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.dao.ProductDAO;
import com.niit.EcommerceBackend.model.Category;
import com.niit.EcommerceBackend.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Pagecontroller {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView display()
	{
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","Home");
		 mv.addObject("userClickHome",true);
		 return mv;

	}
	@RequestMapping("/about")
	public ModelAndView about()
	{
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","About us");
		 mv.addObject("userClickAbout",true);
		 return mv;

	}
	
	@RequestMapping("/contact")
	public ModelAndView contact()
	{
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","Contact us");
		 mv.addObject("userClickContact",true);
		 return mv;

	}
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","Login");
		 mv.addObject("userClickLogin",true);
		 return mv;

	}
	
	@RequestMapping("/product")
	public ModelAndView product()
	{
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","Product");
		 mv.addObject("categories", categoryDAO.lists());
		 mv.addObject("userClickProduct",true);
		 return mv;

	}
	
	@RequestMapping("/category/{id}/products")
	public ModelAndView category(@PathVariable("id")int id)
	{
		Category category=null;
		category= categoryDAO.get(id);
		
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title",category.getName());
		 mv.addObject("categories", categoryDAO.lists());
		 mv.addObject("category",category);
		 mv.addObject("userClickCategoryProduct",true);
		 return mv;

	}
	
//	code for single page product
	@RequestMapping("/show/{id}/products")
	public ModelAndView showSingleProducts(@PathVariable("id") int id) 
	{
		ModelAndView mv=new ModelAndView("page");
		Product product=productDAO.get(id);
		
		product.setViews(product.getViews()+1);
		
		productDAO.update(product);
		mv.addObject("title",product.getName());
		mv.addObject("product",product);
		mv.addObject("userClickSingleProduct",true);
				return mv;
	}
}
