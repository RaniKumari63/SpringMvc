 package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeServlet1 {
	/*
	 * @RequestMapping("/hello1") public String sayHello() { return "welcome2.jsp";
	 * }
	 */
	@RequestMapping("/hello1")
  public ModelAndView sayHello()
  {
	  System.out.println("rrrrrrrrrrrrrr");
	  ModelAndView m=new ModelAndView();
	  m.addObject("msg","Its Interesting lets Wiat&&&&&&&&&&& Two");
	  
	m.setViewName("welcome2.jsp"); 
	return m;
	  
  }
}
