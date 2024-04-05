package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
@RequestMapping("/hello.sp")
public String display(@RequestParam("name") String name1,@RequestParam("pass") String pass1,Model model)
{
	
	if(pass1.equalsIgnoreCase("rani"))
	{
		String msg="Hello"+name1;
		model.addAttribute("message", msg);
	
	return "viewpage.jsp";
	}else
	{
		String msg="sorry"+name1+"you entered an incorrect password";
		return "error.jsp";
	}
	
}
}
