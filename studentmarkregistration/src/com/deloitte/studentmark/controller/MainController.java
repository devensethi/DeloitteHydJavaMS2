package com.deloitte.studentmark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home()
	{
		return "Home";
	}
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Welome";
	}
}
