package com.suchiit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	/*
	 * @RequestMapping("/login.ds") public String loginForm(HttpServletRequest
	 * req,Model model) { String msg=""; String uname=req.getParameter("uname");
	 * String pwd=req.getParameter("pwd");
	 * if(uname.equals("rani")&&pwd.equals("rani")) { msg="valid user"; } else {
	 * msg="invalid user"; } model.addAttribute("msg1", msg); return "index.jsp";
	 * 
	 * }
	 */
	@RequestMapping("/login.ds")
	public String loginForm(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd,Model model)
	{ String msg=""; 
		if (uname.equals("rani") && pwd.equals("rani")) {
			msg = "valid user";
		} else {
			msg = "invalid user";
		}
		model.addAttribute("msg1", msg);
		return "index.jsp";

	}

}
