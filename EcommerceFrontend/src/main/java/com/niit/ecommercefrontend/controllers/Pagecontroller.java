package com.niit.ecommercefrontend.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.model.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Pagecontroller {
	
	@Autowired
	CategoryDAO categoryDAO;
	
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
	
	@RequestMapping("/product")
	public ModelAndView product()
	{
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","Product");
		 mv.addObject("userClickProduct",true);
		 return mv;

	}
	
	@RequestMapping("/category/{id}/product")
	public ModelAndView category(@PathVariable("id")int id)
	{
		Category category=null;
		
		category= categoryDAO.get(id);
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","Product");
		 mv.addObject("categories", categoryDAO.lists());
		 mv.addObject("userCategoryProduct",true);
		 return mv;

	}
}
