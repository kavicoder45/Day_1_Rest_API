package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NameController {

	@ResponseBody
	@RequestMapping("/")
	
	public String getName()
	{
		String StudentName = "kaviaraasn";
		return "welcome"+StudentName+"!";
	}
	
}
