package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suchiit.model.Product;

@Controller
public class ProductController {
	@RequestMapping("/loadForm.sp")
public String loadForm(Model model)
{
		
		Product product=new Product();
		model.addAttribute("product1",product);
	return "product.jsp";
	
}
	@RequestMapping("/insert.sp")
	public String handleForm(@ModelAttribute("product") Product product)
	{
		return "welcome.jsp";
	}
}
