package com.niit.ecommercefrontend.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.dao.ProductDAO;
import com.niit.EcommerceBackend.model.Category;
import com.niit.EcommerceBackend.model.Product;
import com.niit.ecommercefrontend.util.FileUtil;
import com.niit.ecommercefrontend.validator.ProductValidator;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	
	@RequestMapping(value="/products" ,method=RequestMethod.GET)
	public ModelAndView manageProduct(@RequestParam(name="operation",required=false) String operation)
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Product management");
		mv.addObject("userClickManageProducts",true);
		
		
		Product np=new Product();
		np.setSupplierId(1);
		np.setActive(true);
		
		mv.addObject("product",np);
		if(operation !=null)
		{
			if(operation.equals("product"))
			{
				mv.addObject("message","Product Submitted Successfully");
			}
		
		}		
		return mv;
	}
	
	
	@RequestMapping(value="/products" ,method=RequestMethod.POST)
	public String transmissionProduct(@Valid  @ModelAttribute("product") Product mproduct,BindingResult results,Model model,HttpServletRequest request)
	{
		
		if(mproduct.getId()==0)
		{
			new ProductValidator().validate(mproduct, results);
		}
		else
		{
			if(!mproduct.getFile().getOriginalFilename().equals(""))
			{
				new ProductValidator().validate(mproduct, results);
			}
		}
		
		
		if(results.hasErrors())
		{
			model.addAttribute("userClickManageProducts",true);
			model.addAttribute("title","Manage Products");
			model.addAttribute("message","Validation Failed");
			
			return "page";
		}
		
	 productDAO.add(mproduct);
	 
	 //MultipartFile
	 if(!mproduct.getFile().getOriginalFilename().equals(""))
	 {
		 FileUtil.uploadFile(request,mproduct.getFile(),mproduct.getCode());
	 }
		
	 
	 return "redirect:/manage/products?operation=product";
	}
	
	@ModelAttribute("categories")
	public List<Category> modelCategories()
	{
		return categoryDAO.lists();
	}

}
