package com.suchiit.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello1.sp")
 public ModelAndView loginform(@RequestParam("name") String name, Model model)
 {
	Map m=new HashMap();	
		m.put("msg1",name+"hhhhhhhhhhhhhhhhh");
		ModelAndView mav=new ModelAndView("welcome.jsp",m);
	return mav;
	 
 }
	
	
}
