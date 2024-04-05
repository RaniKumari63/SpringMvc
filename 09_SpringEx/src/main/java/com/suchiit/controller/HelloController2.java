package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
@RequestMapping("/hello2.sp")
public String display()
{
	return "viewpage2.jsp";
}
}
