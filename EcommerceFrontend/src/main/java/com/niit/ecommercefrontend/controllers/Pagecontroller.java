package com.niit.ecommercefrontend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class Pagecontroller {
	
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
}
