package com.suchiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suchiit.model.Reservation;
@RequestMapping("/reservation")
@Controller
public class ReservationController {
@RequestMapping("/bookingForm.sp")

public String bookingForm(Model model)
{
	Reservation res=new Reservation();
	
	model.addAttribute("reservation", res);
	return "reservation-page.jsp;";
	
}
@RequestMapping("/submitForm.sp")  
//@ModelAttribute binds form data to the object  
public String submitForm(@ModelAttribute("reservation") Reservation res)  
{  
 return "confirmation.jsp";  
}  
}
