package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class colorGame {
	
	@RequestMapping("//")
	@ResponseBody
	
	public String getMyFav()
	{
		String color = "Green";
		
		return "My favourite color is "+color;
	}

}
