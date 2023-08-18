package com.example.demo.Controllers;

//day one Exercise : Welcome
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ApiController {
			
	@RequestMapping("/welcome")
	@ResponseBody
	public String Welcome(){
		
		return "Welcome Spring Boot";
	}
	
}
