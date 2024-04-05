package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeServlet {
	
  @RequestMapping("/hello")
	public String sayHello()
	{
		return "welcome.jsp";
	}
}
