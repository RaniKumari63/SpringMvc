package com.suchiit.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeServlet {
	/*
	 * @RequestMapping("/hello1") public String sayHello() { return "welcome2.jsp";
	 * }
	 */
	@RequestMapping("/hello1")
  public ModelAndView sayHello()
  {
	  
	  ModelAndView m=new ModelAndView();
	  m.addObject("","Its Interesting lets Wiat Two");
	m.setViewName("welcome2.jsp"); 
	return m;
	  
  }
}
