package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suchiit.model.Student;

@Controller
public class StudentController {
	@RequestMapping("/load.stu")
	public String loadForm(Model model)
	{
		
	
		Student student=new Student();
		model.addAttribute("student1",student);
		return "student.jsp";
		
	}
@RequestMapping("/insert.stu")
public String handleForm(@ModelAttribute("student") Student student)
{
	return "index.jsp";
	
}

}
