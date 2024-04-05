package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
@RequestMapping("/hello1.sp")
public String display()
{
	return "viewpage1.jsp";
}
}
